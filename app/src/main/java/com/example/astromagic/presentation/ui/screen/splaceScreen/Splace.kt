package com.example.astromagic.presentation.ui.screen.splaceScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.example.astromagic.R
import com.example.astromagic.Utils.NavigationRoutes
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp
import kotlinx.coroutines.delay


@Composable
fun SplaceScreen(navController: NavHostController) {
    LaunchedEffect(Unit) {
        delay(3000L)
        // Navigate to the OnboardingScreen
        navController.navigate(NavigationRoutes.STARTUP1) {
            // Clears the back stack so the user can't navigate back to the splash screen
            popUpTo(NavigationRoutes.SPLASH) {
                inclusive = true
            }
        }
    }
    val blueGradient = Brush.verticalGradient(
        colors = listOf(Color(0xfff15a97), Color(0xff7a4f9f))
    )
    Box(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.backgroundimg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.94f)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = null,
                        modifier = Modifier.size(185.sdp)
                    )
                    Text(
                        text = "Astromagic",
                        style = TextStyle(
                            brush = blueGradient,
                            fontSize = 46.ssp,
                            fontWeight = FontWeight.Bold,
                        ),
                        textAlign = TextAlign.Center
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.34f)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom

                ) {
                    Spacer(modifier = Modifier.padding(top = 65.sdp))
                    Row {
                        Text(
                            text = "Sponsored & Promote by ",
                            fontSize = 9.ssp,
                            color = Color(0xff9b8699)
                        )
                        Text(
                            text = "ERAM LABS",
                            fontSize = 9.ssp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xff9b8699),
                        )
                    }
                    Row(modifier = Modifier.padding(bottom = 8.sdp)) {
                        Text(
                            text = "copyright ",
                            fontSize = 9.ssp,
                            color = Color(0xff9b8699),
                        )
                        Text(
                            text = "©Mobirizer 2024",
                            fontSize = 9.ssp,
                            color = Color(0xff9b8699),
                        )
                    }
                }
            }
        }
    }
}