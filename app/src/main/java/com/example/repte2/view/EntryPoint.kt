package com.example.repte2.view


import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.repte2.Routes
import com.example.repte2.viewModel.CharacterViewModel
import com.example.repte2.viewModel.NameViewModel

@Composable
fun EntryPoint(navigationController: NavController) {
    NavHost(
        navController = navigationController as NavHostController,
        startDestination = Routes.Screen1.route
    ) {
        composable(Routes.Screen1.route) { LaunchScreen(navigationController) }

        composable(Routes.Screen2.route) { CharacterScreen(navigationController) }

        composable(Routes.Screen3.route) { backStackEntry ->
            val character = backStackEntry.arguments?.getString("character") ?: "goku"
            val characterViewModel = remember { CharacterViewModel(character) }
            NameScreen(navigationController, characterViewModel)
        }

        composable(Routes.Screen4.route) { backStackEntry ->
            val character = backStackEntry.arguments?.getString("character") ?: "goku"
            val name = backStackEntry.arguments?.getString("name") ?: "John Doe"
            val nameViewModel = remember { NameViewModel(character, name) }
            ResultScreen(navigationController, nameViewModel)
        }
    }
}