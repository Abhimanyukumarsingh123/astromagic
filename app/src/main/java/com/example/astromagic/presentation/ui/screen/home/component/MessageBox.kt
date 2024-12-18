package com.example.astromagic.presentation.ui.screen.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.astromagic.data.getChatItems
import ir.kaaveh.sdpcompose.sdp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.astromagic.data.ChatItem
import com.example.astromagic.data.getChatItems
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun MessageBox(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        ChatBox(modifier = Modifier.fillMaxSize())
    }
}

@Composable
fun ChatBox(modifier: Modifier) {
    val chatItems = getChatItems()

    LazyColumn(
        modifier = modifier.fillMaxSize(),
    ) {
        items(chatItems) { chatItem ->
            MainChatBox(
                imageResId = chatItem.backgroundResId,
                name = chatItem.name,
                description = chatItem.description,
                like = chatItem.like
            )
        }
    }
}

@Composable
fun MainChatBox(
    imageResId: Int, name: String, description: String, like: String
) {
    val blueGradient = Brush.verticalGradient(
        colors = listOf(Color(0x80F15A97), Color(0x4D7A4F9F))
    )
    Card(
        modifier = Modifier
            .padding(start = 20.sdp, end = 20.sdp, bottom = 20.sdp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(10.dp), // Optional: Set elevation if needed
        colors = CardDefaults.cardColors(containerColor = Color(0x1AFFFFFF))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize() // Fill the card area
                .background(blueGradient)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                BackgroundImage(imageResId = imageResId, text = name)
                ChatDetails(description = description, like = like)
            }
        }
    }
}

@Composable
fun BackgroundImage(imageResId: Int, text: String) {
    Box(
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = "",
            modifier = Modifier.clip(RoundedCornerShape(topStart = 8.sdp, topEnd = 8.sdp))
        )
        Text(
            text = text,
            color = Color.White,
            fontSize = 19.ssp,
            modifier = Modifier.align(Alignment.BottomCenter),
            textAlign = TextAlign.Center

        )
    }
}

@Composable
fun ChatDetails(description: String, like: String) {
    val blueGradient = Brush.verticalGradient(
        colors = listOf(Color(0xffF15A97), Color(0xff7A4F9F)) // Two colors for the gradient
    )
    Spacer(modifier = Modifier.padding(top = 5.sdp))
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = description,
            color = Color(0xFFFFFFFF),
            fontSize = (12.ssp),
            modifier = Modifier.padding(start = 5.sdp, end = 5.sdp),
            style = TextStyle(fontStyle = FontStyle.Italic)
        )
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.sdp, end = 20.sdp)
        ) {
            Text(
                text = " 422K",
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.weight(.1f))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(14.sdp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                modifier = Modifier
                    .padding(bottom = 8.sdp)
                    .align(Alignment.CenterVertically)
                    .background(blueGradient, shape = RoundedCornerShape(20.sdp))
                    .size(width = 85.sdp, height = 30.sdp)

            ) {
                Text(text = "Chat Now", modifier = Modifier.fillMaxSize(), fontSize = 10.ssp)
            }
        }
    }
}