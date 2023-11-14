package com.example.spacevpn.startscreen.presentetion

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.spacevpn.navigation.NavGraph
import com.example.spacevpn.ui.theme.SpaceVpnTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.rememberNavHostEngine

class StartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpaceVpnTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController )
                // A surface container using the 'background' color from the theme

            Log.d("gte", "Dw")

                Log.w("", "Fd")



            }
        }
    }
}

