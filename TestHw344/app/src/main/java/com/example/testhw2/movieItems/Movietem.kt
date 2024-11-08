package com.example.testhw2.movieItems

import GradientBox
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testhw2.movieItems.imageLoader.LoadImage
import graphik

@Composable
fun MovieItem(movie: Movie) {
    Box(
        modifier = Modifier
            .padding(end = 10.dp)
            .width(111.dp)
            .height(200.dp)
            .clickable { }
    ) {

        LoadImage(
            url = movie.imageUrl,
            contentDescription = movie.title,
        )

        GradientBox(showGradient = movie.showGradient)

        Box(
            modifier = Modifier
                .offset(x = 88.dp, y = 6.dp)
                .width(17.dp)
                .height(10.dp)
                .clip(
                    RoundedCornerShape(
                        topEnd = 4.dp,
                        topStart = 4.dp,
                        bottomStart = 4.dp,
                        bottomEnd = 4.dp
                    )
                )
                .background(Color(0xFF3D3BFF))
        ) {
            Text(
                text = movie.rating.toString(),
                color = Color.White,
                fontSize = 6.sp,
                fontFamily = graphik,
                fontWeight = FontWeight(500),
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }

        Column(modifier = Modifier.padding(top = 162.dp)) {
            Text(
                movie.title,
                fontFamily = graphik,
                fontWeight = FontWeight(400),
                fontSize = 14.sp,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black,
                maxLines = 1
            )
            Text(
                movie.genre,
                fontFamily = graphik,
                fontWeight = FontWeight(400),
                fontSize = 12.sp,
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray,
                maxLines = 1
            )
        }
    }
}
