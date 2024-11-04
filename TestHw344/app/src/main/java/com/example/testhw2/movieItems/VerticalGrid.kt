package com.example.testhw2.movieItems

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.testhw2.R

@Composable
fun VerticalGridScreen(navController: NavController) {
    val premieres = remember { mutableStateOf(emptyList<Movie>()) }
    val popularity = remember { mutableStateOf(emptyList<Movie>()) }
    val usa = remember { mutableStateOf(emptyList<Movie>()) }
    val top250 = remember { mutableStateOf(emptyList<Movie>()) }
    val dramaFrance = remember { mutableStateOf(emptyList<Movie>()) }
    val serials = remember { mutableStateOf(emptyList<Movie>()) }
    LaunchedEffect(Unit) {
        val vseKino = fetchKino() ?: emptyList()

        premieres.value = vseKino.take(30)
        popularity.value = vseKino.take(7)
        usa.value = vseKino.take(7)
        top250.value = vseKino.take(7)
        dramaFrance.value = vseKino.take(7)
        serials.value = vseKino.take(7)
    }

    Box() {
        Row(
            modifier = Modifier
                .width(360.dp)
                .height(56.dp)
                .padding(top = 23.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.carett),
                contentDescription = "Icon",
                alignment = AbsoluteAlignment.CenterLeft,
                modifier = Modifier
                    .size(80.dp)
                    .offset(x = 26.dp, y = 16.dp)
                    .clickable {navController.navigate("home")}
            )
            Text(
                text = "Сериалы",
                modifier = Modifier
                    .offset(x = 95.dp, y = 16.5.dp),
                color = Color.Black,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                lineHeight = 13.2.sp
            )
        }
    }
        LazyVerticalGrid(
            columns = GridCells.Adaptive(95.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(horizontal = 83.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp)
        ) {
            items(premieres.value) { movies ->
                MovieItem(movies)
            }
        }
    }