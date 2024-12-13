package com.example.repte2

sealed class Routes(val route: String) {
    object Screen1 : Routes("screen1")

    object Screen2 : Routes("screen2") {
        fun createRoute() = "screen2"
    }

    object Screen3 : Routes("screen3/{character}") {
        fun createRoute(character: String?) = "screen3/$character"
    }

    object Screen4 : Routes("screen4/{character}/{name}") {
        fun createRoute(character: String?, name: String) = "screen4/$character/$name"
    }
}