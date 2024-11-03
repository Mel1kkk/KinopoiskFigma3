package com.example.testhw2.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import com.example.testhw2.R
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.testhw2.pages.HomeScreen
import com.example.testhw2.pages.ProfileScreen
import com.example.testhw2.pages.SearchScreen

@Composable
fun BottomNavigationPage() {
    val navController = rememberNavController() // Remember the nav controller

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Main content area controlled by the navController
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            NavHost(
                navController = navController,
                startDestination = "home" // Default screen
            ) {
                composable("home") { HomeScreen() }      // Home screen route
                composable("search") { SearchScreen() }  // Search screen route (add your screen later)
                composable("profile") { ProfileScreen() } // Profile screen route (add your screen later)
            }
        }

        // Bottom Navigation Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(Color.White),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavigationIcon(
                imageId = R.drawable.home,
                description = "Home",
                onClick = { navController.navigate("home") } // Navigate to Home
            )
            Spacer(modifier = Modifier.width(60.dp))
            NavigationIcon(
                imageId = R.drawable.search,
                description = "Search",
                onClick = { navController.navigate("search") } // Navigate to Search
            )
            Spacer(modifier = Modifier.width(60.dp))
            NavigationIcon(
                imageId = R.drawable.profile,
                description = "Profile",
                onClick = { navController.navigate("profile") } // Navigate to Profile
            )
        }
    }
}


@Composable
fun NavigationIcon(imageId: Int, description: String, onClick: () -> Unit) {
    Image(
        painter = painterResource(id = imageId),
        contentDescription = description,
        modifier = Modifier
            .size(24.dp)
            .clickable { onClick() }
            .padding(2.dp),
        contentScale = ContentScale.Fit,
        colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.Black)
    )
}
