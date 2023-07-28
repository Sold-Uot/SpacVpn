package com.example.spacevpn.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.spacevpn.animation.EnterAnimation
import com.example.spacevpn.loginscreen.LoginScreen
import com.example.spacevpn.startscreen.presentetion.StartScreen

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.StartSc.route)
    {
        composable(route = Screens.LoginSc.route){
            EnterAnimation {
                LoginScreen()
            }

        }
        composable(route = Screens.StartSc.route){
            StartScreen(navController)
        }


    }
}

