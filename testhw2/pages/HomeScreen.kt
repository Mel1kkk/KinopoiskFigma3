package com.example.testhw2.pages

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.testhw2.entities.SkillCinemaText
import com.example.testhw2.movieItems.Movie
import com.example.testhw2.movieItems.MovieSection
import com.example.testhw2.movieItems.fetchKino

@Composable
fun HomeScreen() {
    val premieres = remember { mutableStateOf(emptyList<Movie>()) }
    val popularity = remember { mutableStateOf(emptyList<Movie>()) }
    val usa = remember { mutableStateOf(emptyList<Movie>()) }
    val top250 = remember { mutableStateOf(emptyList<Movie>()) }
    val dramaFrance = remember { mutableStateOf(emptyList<Movie>()) }
    val serials = remember { mutableStateOf(emptyList<Movie>()) }

    LaunchedEffect(Unit) {
        val vseKino = fetchKino() ?: emptyList()

        premieres.value = vseKino.take(7)
        popularity.value = vseKino.take(7)
        usa.value = vseKino.take(7)
        top250.value = vseKino.take(7)
        dramaFrance.value = vseKino.take(7)
        serials.value = vseKino.take(7)
    }


    LazyColumn(modifier = Modifier.padding(horizontal = 20.dp)) {
        item {
            SkillCinemaText()
        }
        item {
            MovieSection(title = "Премьеры", movies = premieres.value)
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            MovieSection(title = "Популярное", movies = popularity.value)
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            MovieSection(title = "Боевики США", movies = usa.value)
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            MovieSection(title = "Топ-250", movies = top250.value)
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            MovieSection(title = "Драмы Франции", movies = dramaFrance.value)
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            MovieSection(title = "Сериалы", movies = serials.value)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
