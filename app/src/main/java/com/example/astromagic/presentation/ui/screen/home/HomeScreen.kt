package com.example.astromagic.presentation.ui.screen.home

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
import com.example.astromagic.presentation.ui.screen.home.component.BottomTaskbar
import com.example.astromagic.presentation.ui.screen.home.component.TopBar
import com.example.astromagic.presentation.ui.screen.home.component.MessageBox


@Composable
fun HomeScreen(navController: NavHostController) {
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
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            TopBar(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .weight(.2f)
            )
            MessageBox(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .weight(.8f)
            )
        }
        BottomTaskbar(
            modifier = Modifier
                .align(Alignment.BottomCenter),
            navController
        )
    }
}




