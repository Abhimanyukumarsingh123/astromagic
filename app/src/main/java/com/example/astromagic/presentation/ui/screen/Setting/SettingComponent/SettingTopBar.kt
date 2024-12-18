package com.example.astromagic.presentation.ui.screen.Setting.SettingComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.astromagic.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun SettingTopBar(modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxSize()
            .padding(vertical = 7.sdp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row {
            Spacer(modifier = Modifier.padding(start = 20.sdp))
            Image(
                painter = painterResource(id = R.drawable.backicon),
                contentDescription = "",
                modifier = Modifier
                    .size(16.sdp)
            )
            Spacer(modifier = Modifier.padding(start = 10.sdp))
            Text(
                text = "Birth chat Analysis",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 17.ssp,
                ),
            )
        }
    }

}
