package com.example.astromagic.presentation.ui.screen.startup2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.example.astromagic.R
import com.example.astromagic.Utils.NavigationRoutes
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun startupScreen2(navController: NavHostController) {
    val blueGradient = Brush.verticalGradient(
        colors = listOf(Color(0xfff15a97), Color(0xff7a4f9f))
    )
    Box(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.backgroundimg2),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.sdp)
                    .clip(RoundedCornerShape(topStart = 22.sdp, topEnd = 22.sdp))
                    .background(color = Color(0xffffffff))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.backgroundbutton),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Spacer(modifier = Modifier.padding(top = 15.sdp))
                    Text(
                        text = "Check your compatibility",
                        modifier = Modifier.padding(start = 40.sdp, end = 40.sdp),
                        style = TextStyle(
                            color = Color.White, fontSize = 17.ssp, fontWeight = FontWeight.Bold
                        ),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.padding(top = 18.sdp))
                    Text(
                        text = "Relationships Secrets",
                        modifier = Modifier.padding(start = 5.sdp, end = 5.sdp),
                        style = TextStyle(
                            brush = blueGradient,
                            fontSize = 29.ssp,
                            fontWeight = FontWeight.Bold,
                        ),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.padding(top = 18.sdp))
                    Text(
                        text = "Curious about marriage and soulmate ? \n" +
                                "Who, When ? Get all answers ..",
                        modifier = Modifier.padding(start = 40.sdp, end = 40.sdp),
                        style = TextStyle(
                            color = Color(0xffa2c5ff),
                            fontSize = 13.ssp,
                            fontStyle = FontStyle.Italic

                        ),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.padding(top = 22.sdp))
                    Button(
                        onClick = {
                            navController.navigate(NavigationRoutes.STARTUP3) {
                                popUpTo(NavigationRoutes.STARTUP2) { inclusive = true }
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .padding(start = 40.sdp, end = 40.sdp)
                            .size(width = 295.sdp, height = 43.sdp)
                            .background(blueGradient, shape = RoundedCornerShape(30.sdp))
                    ) {
                        Text(
                            text = "Next", fontSize = 12.ssp, fontWeight = FontWeight.Bold
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Text(
                            text = "www.astromagic.ai",
                            modifier = Modifier.padding(
                                start = 40.sdp,
                                end = 40.sdp,
                                bottom = 12.sdp
                            ),
                            style = TextStyle(
                                color = Color(0xffa2c5ff),
                                fontSize = 13.ssp,
                            ),
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
        }
    }
}