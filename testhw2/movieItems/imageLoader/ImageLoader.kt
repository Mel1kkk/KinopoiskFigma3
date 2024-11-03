package com.example.testhw2.movieItems.imageLoader

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.request.ImageRequest

@Composable
fun LoadImage(url: String?, contentDescription: String?) {
    val painter = rememberImagePainter(
        ImageRequest.Builder(LocalContext.current)
            .data(url)
            .crossfade(true)
            .build()
    )

    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = Modifier.size(111.dp, 156.dp),
        contentScale = ContentScale.Crop
    )
}


