package com.example.repte2.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.repte2.R
import com.example.repte2.Routes
import com.example.repte2.viewModel.CharacterViewModel

val characterViewModel = CharacterViewModel("goku")

@Composable
fun CharacterScreen(navController: NavController) {
    val characters = listOf("goku","gomah","masked_majin","piccolo","supreme","vegeta")
    val charactersGroups = characters.chunked(3)

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

        charactersGroups.forEach { group ->
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                items(group) { character ->
                    CharacterImage(character)
                }
            }
        }

        Button(
            modifier = Modifier.padding(16.dp).width(350.dp).height(75.dp),
            onClick = { navController.navigate(Routes.Screen3.createRoute(characterViewModel.character.value)) }
        ) {
            Text(
                text = "Continuar",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun CharacterImage(a: String) {
    Button(
        onClick = {
            characterViewModel.updateCharacter(a)
        },
        modifier = Modifier
            .size(150.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        )
    ) {
        Image(
            painter = painterResource(id = CharacterNumberDrawable(a)),
            contentDescription = "Character",
            modifier = Modifier
                .width(100.dp)
                .height(100.dp))
    }
}

@Composable
fun CharacterNumberDrawable(a: String): Int {
    return when (a) {
        "goku" -> R.drawable.goku
        "gomah" -> R.drawable.gomah
        "masked_majin" -> R.drawable.masked_majin
        "piccolo" -> R.drawable.piccolo
        "vegeta" -> R.drawable.vegeta
        "supreme" -> R.drawable.supreme
        else -> {
            R.drawable.dragonball_daima_logo
        }
    }
}
