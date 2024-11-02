package com.example.testhw2.entities

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ShowAllButton() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp)
    ) {

        Spacer(modifier = Modifier.height(42.dp))

        Box(
            modifier = Modifier
                .size(32.dp)
                .background(Color.White, shape = RoundedCornerShape(16.dp))
                .clickable { /* кнопка показать все */ },
            contentAlignment = Alignment.Center
        ) {
            // стрелка
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = null,
                tint = Color.Blue,
                modifier = Modifier.size(16.dp)
            )
        }
        // "Показать все"
        Text(
            text = "Показать все",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Blue,
            modifier = Modifier.padding(top = 0.dp)
        )
    }
}