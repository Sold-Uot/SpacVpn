package com.example.spacevpn.navigation

sealed class Screens(val route:String){
    object LoginSc : Screens("login_screen")
    object StartSc : Screens("start_screen")
}
