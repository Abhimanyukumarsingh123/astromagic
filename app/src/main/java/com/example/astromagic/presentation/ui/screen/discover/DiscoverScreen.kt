package com.example.astromagic.presentation.ui.screen.discover


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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.navigation.NavHostController
import com.example.astromagic.R
import com.example.astromagic.Utils.NavigationRoutes
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun DiscoverScreen(navController: NavHostController) {
    val blueGradient = Brush.verticalGradient(
        colors = listOf(Color(0xfff15a97), Color(0xff7a4f9f))
    )
    val name = remember { mutableStateOf(TextFieldValue("")) }

    Box(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.profilebackgroundimg),
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
                text = "CHOOSE WHAT WOULD \n" +
                        "BE LIKE EXPLORE",
                modifier = Modifier.padding(start = 25.sdp, end = 25.sdp),
                style = TextStyle(
                    color = Color.White, fontSize = 23.ssp,
                ),
                textAlign = TextAlign.Center
            )

        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(470.sdp)
                    .clip(RoundedCornerShape(topStart = 22.sdp, topEnd = 22.sdp))
                    .background(color = Color(0xffffffff))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.discover),
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
                        text = "Discover your\n" +
                                "MagicalIdentity",
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(start = 20.sdp),
                        style = TextStyle(
                            blueGradient,
                            fontSize = 29.ssp,
                            fontWeight = FontWeight.Bold,
                        ),
                    )
                    Spacer(modifier = Modifier.padding(top = 20.sdp))
                    Text(
                        text = "Hi, Adam what’s the" ,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(start = 20.sdp),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 14.ssp,
                        ),
                    )
                    Text(
                        text = "Nature of you concern?",
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(start = 20.sdp),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 20.ssp,
                        ),
                    )
                    Spacer(modifier = Modifier.padding(top = 17.sdp))
                    Text(
                        text = "to calculate your Sun And Moon signs",
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(start = 20.sdp),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 11.ssp,
                            fontStyle = FontStyle.Italic
                        ),
                    )

                    Spacer(modifier = Modifier.padding(top = 20.sdp))
                    Button(
                        onClick = {
                            navController.navigate(NavigationRoutes.HOMESCREEN) {
                                popUpTo(NavigationRoutes.DISCOVERSCREEN ) { inclusive = true }
                            }

                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .padding(start = 25.sdp, end = 25.sdp)
                            .size(width = 310.sdp, height = 43.sdp)
                            .background(blueGradient, shape = RoundedCornerShape(30.sdp))
                    ) {
                        Text(
                            text = "My Prosperity and well-being", fontSize = 12.ssp, fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 15.sdp))

                    Button(
                        onClick = {
                            navController.navigate(NavigationRoutes.HOMESCREEN) {
                                popUpTo(NavigationRoutes.DISCOVERSCREEN ) { inclusive = true }
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .padding(start = 25.sdp, end = 25.sdp)
                            .size(width = 310.sdp, height = 43.sdp)
                            .background(blueGradient, shape = RoundedCornerShape(30.sdp))
                    ) {
                        Text(
                            text = "My Prosperity and well-being", fontSize = 12.ssp, fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 15.sdp))
                    Button(
                        onClick = {
                            navController.navigate(NavigationRoutes.HOMESCREEN) {
                                popUpTo(NavigationRoutes.DISCOVERSCREEN ) { inclusive = true }
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .padding(start = 25.sdp, end = 25.sdp)
                            .size(width = 310.sdp, height = 43.sdp)
                            .background(blueGradient, shape = RoundedCornerShape(30.sdp))
                    ) {
                        Text(
                            text = "My Prosperity and well-being", fontSize = 12.ssp, fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 22.sdp))
                    Text(
                        text = "Astromagic",
                        modifier = Modifier
                            .align(Alignment.End)
                            .padding(end = 20.sdp),
                        style = TextStyle(
                            blueGradient,
                            fontSize = 18.ssp,
                        ),
                    )
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Text(
                            text = buildAnnotatedString {
                                append("Sponsored & Promote by ")
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                    append("ERAM LABS")
                                }
                            },
                            modifier = Modifier.padding(bottom = 0.sdp),
                            color = Color(0xFFB0549B),
                            fontSize = 10.ssp,
                            textAlign = TextAlign.Center,
                        )
                        Text(
                            text = "copyright © Mobirizer 2024",
                            modifier = Modifier.padding(bottom = 15.sdp),
                            style = TextStyle(
                                color = Color(0xff7C4F9F), fontSize = 10.ssp,
                            ),
                            textAlign = TextAlign.Center
                        )
                    }

                }
            }
        }
    }
}