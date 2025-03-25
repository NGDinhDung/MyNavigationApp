package com.example.mynavigationapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mynavigationapp.ui.screens.DetailScreen
import com.example.mynavigationapp.ui.screens.HomeScreen
import com.example.mynavigationapp.ui.screens.ListScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("list") { ListScreen(navController) }
        composable("detail") { DetailScreen(navController) }
    }
}
