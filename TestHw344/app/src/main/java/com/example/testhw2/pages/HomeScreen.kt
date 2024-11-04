package com.example.testhw2.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.testhw2.MovieViewModel
import com.example.testhw2.ScreenState
import com.example.testhw2.entities.SkillCinemaText
import com.example.testhw2.movieItems.MovieSection
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(navController: NavController, viewModel: MovieViewModel = viewModel()) {
    val screenState = viewModel.screenState.value

    LaunchedEffect(Unit) {
        delay(1000)
        viewModel.fetchData()
    }

    LazyColumn(modifier = Modifier.padding(horizontal = 20.dp)) {
        when (screenState) {
            is ScreenState.Loading -> item {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }

            is ScreenState.Success -> {
                val movies = screenState.data

                item {SkillCinemaText()}

                item {
                    MovieSection(title = "Премьеры", movies = movies.take(7),navController)
                    Spacer(modifier = Modifier.height(16.dp))
                }

                item {
                    MovieSection(title = "Популярное", movies = movies.take(7),navController)
                    Spacer(modifier = Modifier.height(16.dp))
                }

                item {
                    MovieSection(title = "Боевики США", movies = movies.take(7),navController)
                    Spacer(modifier = Modifier.height(16.dp))
                }

                item {
                    MovieSection(title = "Топ-250", movies = movies.take(7),navController)
                    Spacer(modifier = Modifier.height(16.dp))
                }

                item {
                    MovieSection(title = "Драмы Франции", movies = movies.take(7),navController)
                    Spacer(modifier = Modifier.height(16.dp))
                }

                item {
                    MovieSection(title = "Сериалы", movies = movies.take(7),navController)
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }

            is ScreenState.Error -> item {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = rememberAsyncImagePainter("https://png.klev.club/uploads/posts/2024-04/png-klev-club-7y6d-p-oshibka-png-26.png"),
                        contentDescription = "Ошибка",
                        modifier = Modifier.size(150.dp)
                    )
                }
            }

            is ScreenState.Initial -> item {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = rememberAsyncImagePainter("https://w7.pngwing.com/pngs/992/181/png-transparent-graphy-welcome-text-photography-logo-thumbnail.png"),
                        contentDescription = "Добро пожаловать",
                        modifier = Modifier.size(150.dp)
                    )
                }
            }
        }
    }
}
