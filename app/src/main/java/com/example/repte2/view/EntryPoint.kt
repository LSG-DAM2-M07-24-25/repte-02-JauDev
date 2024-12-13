package com.example.repte2.view


import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.repte2.Routes
import com.example.repte2.viewModel.CharacterViewModel

@Composable
fun EntryPoint(navigationController: NavController) {
    NavHost(
        navController = navigationController as NavHostController,
        startDestination = Routes.Screen1.route
    ) {
        composable(Routes.Screen1.route) { LaunchScreen(navigationController) }

        composable(Routes.Screen2.route) { CharacterScreen(navigationController) }

        /*

        composable(Routes.Screen3.route) { backStackEntry ->
            val character = backStackEntry.arguments?.getInt("character") ?: 0
            val characterViewModel = remember { CharacterViewModel(character) }
            CharacterScreen(navigationController, characterViewModel)
        }*/
/*
        composable(Routes.Screen4.route) { backStackEntry ->
            val character = backStackEntry.arguments?.getInt("character") ?: 0
            val name = backStackEntry.arguments?.getString("name") ?: "John Doe"
            ResultScreen(navigationController, character, name)
        }*/
    }
}