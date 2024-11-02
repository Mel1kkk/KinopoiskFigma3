package com.example.testhw2.entities

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SkillCinemaText() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp, bottom = 40.dp)
    ) {
        Text(
            text = "Skillcinema",
            color = Color(0xFF272727),
            modifier = Modifier
                .width(120.dp)
                .height(18.24.dp)
        )
    }
}