package com.example.astromagic.presentation.ui.screen.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import com.example.astromagic.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun TopBar(modifier: Modifier) {
    val blueGradient = Brush.verticalGradient(
        colors = listOf(Color(0xfff15a97), Color(0xff7a4f9f))
    )
    val name = remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 15.sdp,end = 15.sdp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.sdp),
            verticalAlignment = Alignment.CenterVertically, // Align items vertically
            horizontalArrangement = Arrangement.SpaceBetween // Space out items
        ) {
            Text(
                text = "Hi Adam Decosta",
                style = TextStyle(
                    brush = blueGradient,
                    fontSize = 24.ssp,
                    fontWeight = FontWeight.Bold,
                ),
                textAlign = TextAlign.Start
            )
            Image(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = null,
                modifier = Modifier
                    .size(25.sdp)
            )
        }
        Spacer(modifier = Modifier.padding(top = 5.sdp))
        Text(
            text = "Saturday, November 27",
            style = TextStyle(
                color = Color.White,
                fontSize = 16.ssp,
                fontWeight = FontWeight.Normal,
            ),
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.padding(top = 10.sdp))

        Box(
            modifier = Modifier
                .height(40.sdp)
                .background(Color(0x32FFFFFF), shape = RoundedCornerShape(30.sdp))
                .padding(start = 8.sdp, end = 20.sdp)
        ) {
            if (name.value.text.isEmpty()) {
                Text(
                    text = "Find your AI Patners",
                    fontSize = 12.ssp,
                    color = Color(0xFFBEBEBE),
                    modifier = Modifier.align(Alignment.CenterStart)
                )
            }
            BasicTextField(
                value = name.value,
                onValueChange = { name.value = it },
                textStyle = TextStyle(
                    color = Color(0xFFBEBEBE),
                    fontSize = 12.ssp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterStart),
                singleLine = true
            )

        }
    }

}