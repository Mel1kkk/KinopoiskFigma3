package com.example.testhw2.model

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.testhw2.R

@Composable
fun Header(title: String,navHostController: NavHostController){
    BackHandler {
        navHostController.popBackStack()
    }
    Row (
        Modifier.height(56.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(
            painter = painterResource(R.drawable.back_icon),
            contentDescription = "",
            modifier = Modifier.clickable { navHostController.popBackStack() }
        )
        Text(
            text = title,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text="")
    }
}