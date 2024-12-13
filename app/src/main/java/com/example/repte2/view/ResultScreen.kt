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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.repte2.R
import com.example.repte2.Routes

@Composable
fun ResultScreen(navController: NavController, character: String, name: String) {
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


        Image(
            modifier = Modifier
                .width(400.dp)
                .height(400.dp),
            painter = painterResource(id = characterNumberDrawable(character)),
            contentDescription = "User"
        )

        Text(
            text = name,
            fontSize = 20.sp
        )

        Button(
            modifier = Modifier.padding(16.dp).width(350.dp).height(75.dp),
            onClick = { navController.navigate(Routes.Screen2.createRoute()) }
        ) {
            Text(text = "Tornar")
        }
    }
}

@Composable
fun characterNumberDrawable(a: String): Int {
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