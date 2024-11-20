package com.example.testhw2.model

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Title(type: String, navHostController: NavHostController){
    var title = ""
    when (type){
        "TOP_POPULAR_ALL" -> title = "Популярное"
        "VAMPIRE_THEME" -> title = "Вампиры"
        "COMICS_THEME" -> title = "Комиксы"
    }
    Row (
        modifier = Modifier.padding(end = 26.dp).fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(text = title, fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text(modifier = Modifier.clickable {  },
            text = "Все",
            fontSize = 18.sp,
            color = Color(0xFF3D3BFF)
        )
    }
}