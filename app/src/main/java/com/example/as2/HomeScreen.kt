package com.example.as2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testhw2.movieItems.Movie

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .width(360.dp)
            .height(56.dp)
            .padding(start = 26.dp, end = 151.dp, top = 16.dp, bottom = 16.dp)
            .offset(y = 42.dp)
    ) {
        Text(
            text = "Сериалы",
            modifier = Modifier
                .width(57.dp)
                .height(13.dp)
                .offset(x = 152.dp, y = 21.5.dp),
            color = Color.Black,
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            lineHeight = 13.2.sp,
            fontFamily = graphik
        )
        LazyColumn {

        }
    }
    Box() {
        MovieItem(
            movie = Movie(
                "Близкие",
                "драма",
                7.8,
                imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"
            )
        )
    }
}
