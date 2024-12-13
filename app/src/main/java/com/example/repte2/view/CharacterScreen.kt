package com.example.repte2.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.repte2.R

@Composable
fun CharacterScreen(navController: NavController) {
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

        Column (
            modifier = Modifier.fillMaxSize().padding(16.dp),
        ) {
            Row (
                modifier = Modifier.fillMaxSize().padding(16.dp),
            ) {
                CharacterImage(1)
                CharacterImage(2)
                CharacterImage(3)
            }

            Row (
                modifier = Modifier.fillMaxSize().padding(16.dp),
            ) {
                CharacterImage(4)
                CharacterImage(5)
                CharacterImage(6)
            }
        }
    }
}

@Composable
fun CharacterImage(a: Int) {
    Image(
        painter = painterResource(id = Character(a)),
        contentDescription = "Character",
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
    )
}

@Composable
fun Character(a: Int): Int {
    return when (a) {
        1 -> R.drawable.goku
        2 -> R.drawable.gomah
        3 -> R.drawable.masked_majin
        4 -> R.drawable.piccolo
        5 -> R.drawable.vegeta
        6 -> R.drawable.supreme
        else -> {
            R.drawable.goku
        }
    }
}
