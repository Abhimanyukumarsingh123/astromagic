package com.example.astromagic.presentation.ui.screen.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.example.astromagic.R
import com.example.astromagic.Utils.NavigationRoutes
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun BottomTaskbar(modifier: Modifier, navController: NavHostController) {

    Box(
        modifier = modifier
            .statusBarsPadding()
            .fillMaxWidth()
            .height(80.sdp)
            .clip(RoundedCornerShape(topStart = 12.sdp, topEnd = 12.sdp))
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.sdp, end = 10.sdp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            BottomTaskbarItem(iconRes = R.drawable.homeicon, label = "Home",onClick ={
                navController.navigate(NavigationRoutes.HOMESCREEN) {
                    popUpTo(NavigationRoutes.HOMESCREEN) { inclusive = true }
                }
            })
            Spacer(modifier = Modifier.padding(start = 33.sdp))
            BottomTaskbarItem(iconRes = R.drawable.askicon, label = "Ask Now", onClick = {

            })
            Spacer(modifier = Modifier.padding(start = 33.sdp))
            BottomTaskbarItem(iconRes = R.drawable.settingicon, label = "Setting", onClick = {
                navController.navigate(NavigationRoutes.SETTINGsCREEN) {
                    popUpTo(NavigationRoutes.SETTINGsCREEN) { inclusive = true }
                }
            })
        }
    }
}

@Composable
fun BottomTaskbarItem(
    iconRes: Int,
    label: String,
    onClick: () -> Unit
    ) {
    val blueGradient = Brush.verticalGradient(
        colors = listOf(Color(0xfff15a97), Color(0xff7a4f9f))
    )
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .clickable { onClick() }
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier.size(30.sdp)
        )
        Text(
            text = label, style = TextStyle(
                brush = blueGradient,
                fontSize = 15.ssp,
                fontWeight = FontWeight.Bold,
            ), textAlign = TextAlign.Center
        )
    }
}
