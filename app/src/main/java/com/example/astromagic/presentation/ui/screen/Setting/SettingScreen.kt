package com.example.astromagic.presentation.ui.screen.Setting

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.astromagic.R
import com.example.astromagic.presentation.ui.screen.Setting.SettingComponent.SettingProfile
import com.example.astromagic.presentation.ui.screen.Setting.SettingComponent.SettingTopBar
import com.example.astromagic.presentation.ui.screen.home.component.BottomTaskbar

@Composable
fun  SettingScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.backgroundimg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                SettingTopBar(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .weight(.1f)
                )
                SettingProfile(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .weight(.9f)
                )

            }
            BottomTaskbar(
                modifier = Modifier
                    .align(Alignment.BottomCenter),
                navController
            )
        }
    }
}