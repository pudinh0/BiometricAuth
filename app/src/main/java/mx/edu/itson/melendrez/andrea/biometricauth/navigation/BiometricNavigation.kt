package mx.edu.itson.melendrez.andrea.biometricauth.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.edu.itson.melendrez.andrea.biometricauth.view.screens.HomeScreen
import mx.edu.itson.melendrez.andrea.biometricauth.view.screens.LoginScreen


@Composable
fun BiometricNavigation(innerPadding: PaddingValues){
    val navController = rememberNavController()

    NavHost(navController, startDestination=Login){
        composable<Login>{
            LoginScreen(innerPadding, {navController.navigate(Home)})
        }

        composable<Home>{
            HomeScreen(innerPadding) {navController.navigate(Login) }
        }
    }
}