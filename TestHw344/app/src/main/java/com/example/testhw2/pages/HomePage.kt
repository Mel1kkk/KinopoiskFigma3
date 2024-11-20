package com.example.testhw2.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil3.compose.rememberAsyncImagePainter
import com.example.testhw2.model.CollectionScreenState
import com.example.testhw2.model.CollectionViewModel
import com.example.testhw2.model.ShowFilms

@Composable
fun HomePage(
    viewModel: CollectionViewModel = viewModel(),
    navHostController: NavHostController
){
    val screenState by viewModel.screenState.collectAsState()
    val types = listOf("TOP_POPULAR_ALL","VAMPIRE_THEME","COMICS_THEME")

    Box(
        modifier = Modifier.fillMaxSize()
    ){
        when(screenState){
            is CollectionScreenState.Initial -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = coil.compose.rememberAsyncImagePainter("https://w7.pngwing.com/pngs/992/181/png-transparent-graphy-welcome-text-photography-logo-thumbnail.png"),
                        contentDescription = "Добро пожаловать",
                        modifier = Modifier.size(150.dp)
                    )
                }
                viewModel.fetchCollections(types)
            }
            is CollectionScreenState.Loading -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }
            is CollectionScreenState.Error -> {
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
            is CollectionScreenState.Success -> {
                val collectionMap = (screenState as CollectionScreenState.Success).collections
                Column (
                    Modifier.padding(start = 26.dp,top = 77.dp)
                ){
                    Text(text = "Skillcinema", fontSize = 24.sp)
                    LazyColumn {
                        items(types) { type ->
                            val collection = collectionMap.getValue(type)
                            ShowFilms(collection,type, navHostController)
                        }
                    }
                }

            }
        }
    }
}