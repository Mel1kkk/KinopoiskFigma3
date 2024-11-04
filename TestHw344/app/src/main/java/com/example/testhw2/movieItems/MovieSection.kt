package com.example.testhw2.movieItems

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import graphik

@Composable
fun MovieSection(title: String, movies: List<Movie>,navController: NavController) {
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(title, style = MaterialTheme.typography.headlineMedium, fontFamily = graphik, fontSize = 14.sp, fontWeight = FontWeight(600))
            Spacer(Modifier.fillMaxSize(0.8f))
            Text(
                text = "Все",
                fontFamily = graphik,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                lineHeight = 15.4.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFF3D3BFF),
                modifier = Modifier
                    .clickable {navController.navigate("verticalGrid")}
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        MovieRow(movies = movies,navController)
    }
}


