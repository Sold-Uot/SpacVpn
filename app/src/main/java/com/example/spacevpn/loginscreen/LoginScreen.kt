package com.example.spacevpn.loginscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spacevpn.R
import com.example.spacevpn.navigation.Screens
import com.example.spacevpn.ui.theme.MainBlue
import com.example.spacevpn.ui.theme.MainDark
import com.example.spacevpn.ui.theme.MainWhite
import com.example.spacevpn.ui.theme.SpaceVpnTheme
import com.example.spacevpn.ui.theme.backgroundColorWhite

@Preview(showBackground = true)
@Composable
public fun LoginScreen(/*navController: NavController*/) {
    SpaceVpnTheme() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)

        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .padding(horizontal = 45.dp, vertical = 35.dp),
                alignment = Alignment.Center
            )
            Text(
                text = "Hello Again!",
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
                text = "Wellcome back you’ve been missed!",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    fontFamily = FontFamily(Font(R.font.gilroymedioum)),

                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.primary

                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 100.dp, top = 15.dp, end = 100.dp, bottom = 20.dp)
            )
            OutLineTextFieldSample(str = "Enter Your Mail")
            OutLineTextFieldSample(str = "Enter Your password")
            OutLineTextFieldSample(str = "Enter Your password")

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(MainBlue),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .padding(top = 35.dp, start = 32.dp, end = 32.dp),
                shape = RoundedCornerShape(size = 16.dp)
            ) {

                Text(
                    text = "Sing in",
                    color = MainWhite,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.gilroyreg)),

                        )
                )


            }




                Text(
                text = "Войти иным способом",
                textAlign = TextAlign.Center,
                color = Color(0xFF9B9B9B),
                modifier  = Modifier.fillMaxWidth().padding(top = 48.dp)
            )




            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColorWhite),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .padding(top = 35.dp, start = 32.dp, end = 32.dp),
                shape = RoundedCornerShape(size = 16.dp)
            ) {

                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "12",
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)

                    )


                    Text(
                        text = "Войти через Google ",
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.padding(start = 8.dp),


                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.gilroyreg)),

                            )
                    )
                }


            }


        }

    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalTextApi::class)
@Composable
fun OutLineTextFieldSample(str: String) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, end = 32.dp, bottom = 0.dp, top = 5.dp)

            .clip(ShapeDefaults.Large),
        shape = ShapeDefaults.Large,
        value = text,
        label = {
            Text(
                text = str,
                style = TextStyle(
                    brush = Brush.horizontalGradient(
                        colors = listOf<Color>(Color(0xFF6FB87F), Color(0xFF5A76B6))

                    )
                )
            )
        },
        onValueChange = {
            text = it
        }
    )
}