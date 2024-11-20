package com.example.testhw2.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import coil3.compose.rememberAsyncImagePainter
import com.example.testhw2.model.GalleryScreenState
import com.example.testhw2.model.GalleryViewModel
import com.example.testhw2.model.Header
import com.example.testhw2.movieItems.Image

@Composable
fun GalleryPage(
    viewModel: GalleryViewModel = viewModel(),
    navHostController: NavHostController,
    film_id: Int
){
    val screenState by viewModel.screenState.collectAsState()
    val types = listOf("STILL","SHOOTING","POSTER","FAN_ART","PROMO","CONCEPT","WALLPAPER","COVER","SCREENSHOT")

    Box (
        Modifier.fillMaxSize().padding(24.dp)
    ){
        when(screenState){
            is GalleryScreenState.Initial -> {
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
                viewModel.fetchGallery(film_id,types)
            }
            is GalleryScreenState.Loading -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }
            is GalleryScreenState.Error -> {
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
            is GalleryScreenState.Success -> {
                val galleryMap = (screenState as GalleryScreenState.Success).galleries
                val gallery = mutableListOf<Image>()
                for (type in types){
                    val list = galleryMap.getValue(type).items
                    gallery.addAll(list)
                }
                Column {
                    Header("Галерея",navHostController)
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier.fillMaxSize().padding(8.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(gallery){ image ->
                            GalleryImage(image)
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun GalleryImage(image: Image){
    Image(
        modifier = Modifier
            .background(Color.LightGray)
            .size(146.dp,82.dp)
            .clip(RoundedCornerShape(5.dp)),
        painter = rememberImagePainter(
            data = image.previewUrl
        ),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}