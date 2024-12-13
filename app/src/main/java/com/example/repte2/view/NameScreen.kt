package com.example.repte2.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.repte2.R
import com.example.repte2.Routes
import com.example.repte2.viewModel.CharacterViewModel

@Composable
fun NameScreen(navController: NavController, characterViewModel: CharacterViewModel) {
    var name by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .width(400.dp)
                .height(400.dp),
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = "Logo"
        )

        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nom del personatge (${characterViewModel.character.value})") },
            modifier = Modifier.width(300.dp),
        )

        Button(
            modifier = Modifier.padding(16.dp).width(350.dp).height(75.dp),
            onClick = { navController.navigate(Routes.Screen4.createRoute(characterViewModel.character.value, name)) }
        ) {
            Text(text = "Mostrar")
        }
    }
}