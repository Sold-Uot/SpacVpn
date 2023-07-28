package com.example.spacevpn.startscreen.presentetion

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.spacevpn.R
import com.example.spacevpn.animation.AnimateIllustration
import com.example.spacevpn.navigation.Screens
import com.example.spacevpn.ui.theme.MainBlue
import com.example.spacevpn.ui.theme.MainWhite
import com.example.spacevpn.ui.theme.SpaceVpnTheme


@OptIn(ExperimentalTextApi::class)
@Composable
fun StartScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.illustration),
            contentDescription = "sun",
            alignment = Alignment.Center,
            modifier = Modifier
                .padding(start = 45.dp, top = 40.dp, end = 45.dp, bottom = 0.dp)
                .fillMaxWidth()
                .height(328.94754.dp)
                .rotate(AnimateIllustration(30000))
        )

        Text(
            text = "Secure browsing " + "with no limits",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 80.dp),

            style = TextStyle(
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.gilroybold)),
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.primary

            )
        )
        Text(
            text = "With Our encrypted VPN tunnel, your data stay safe, even over public or untrusted Internet connections.",
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 20.sp,
                fontFamily = FontFamily(Font(R.font.gilroymedioum)),

                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.primary

            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, end = 50.dp, top = 22.dp, bottom = 50.dp)
        )


        Button(
            onClick = { navController.navigate(Screens.LoginSc.route) },
            colors = ButtonDefaults.buttonColors(MainBlue),
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(top = 20.dp, start = 40.dp, end = 40.dp)
                .shadow(
                    12.dp,
                    shape = RoundedCornerShape(18.dp),
                    ambientColor = MaterialTheme.colorScheme.primary,
                    spotColor = MaterialTheme.colorScheme.primary
                ),
            shape = RoundedCornerShape(size = 6.dp)
        ) {

            Text(
                text = "Creat An Account",
                color = MainWhite,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.gilroyreg)),

                    )
            )


        }

        Text(
            text = "Sing in", color = MainBlue, modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp), textAlign = TextAlign.Center,
            style = TextStyle(
                brush = Brush.horizontalGradient(
                    colors = listOf<Color>(Color(0xFF4AFF71), Color(0xFF004AFF))
                )
            )
        )


    }


}
