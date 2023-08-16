package com.example.movieapp.navigation

import java.lang.IllegalArgumentException

enum class MoviewScreens {
    HomeScreen,
    DetailScreen;
    companion object {fun fromROute(route: String): MoviewScreens = when (route?.substringBefore("/")) {
        HomeScreen.name -> HomeScreen
        DetailScreen.name -> DetailScreen
        null -> HomeScreen
        else -> throw IllegalArgumentException("Route $route is not reconization")
    }
    }
}