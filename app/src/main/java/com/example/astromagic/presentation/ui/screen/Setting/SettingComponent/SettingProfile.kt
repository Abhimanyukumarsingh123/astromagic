package com.example.astromagic.presentation.ui.screen.Setting.SettingComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import com.example.astromagic.R



@Composable
fun SettingProfile(modifier: Modifier) {
    Box(
        modifier = modifier
            .statusBarsPadding()
            .fillMaxSize()

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(15.sdp))
            Image(
                painter = painterResource(id = R.drawable.appicon), // Replace with actual resource
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(75.sdp)
            )

            Spacer(modifier = Modifier.height(30
                .sdp))

            ProfileInfoBox(
                name = "Seetal Bajaj",
                onEditClick = { /* Action here */ }
            )

            Spacer(modifier = Modifier.height(15.sdp))

            ProfileOptionsBox()
            Spacer(modifier = Modifier.height(15.sdp))

            ProfileOptionsBox1()
        }
    }
}

@Composable
fun ProfileInfoBox(name: String, onEditClick: () -> Unit) {
    Box(
        modifier = Modifier
            .padding(horizontal = 20.sdp)
            .fillMaxWidth()
            .height(60.sdp)
            .background(
                color = Color(0x33FFFFFF),
                shape = RoundedCornerShape(16.sdp)
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 15.sdp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Anonymous Name", color = Color(0xFFCCCCCC), fontSize = 11.ssp)
                Text(
                    text = name,
                    color = Color.White,
                    fontSize = 15.ssp,
                    fontWeight = FontWeight.Bold
                )
            }
            Image(
                painterResource(id = R.drawable.editicon),
                contentDescription = null,
                modifier = Modifier
                    .size(16.sdp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}

@Composable
fun ProfileOptionsBox() {
    Box(
        modifier = Modifier
            .padding(horizontal = 20.sdp)
            .fillMaxWidth()
            .height(95.sdp)
            .background(
                color = Color(0x33FFFFFF),
                shape = RoundedCornerShape(16.sdp)
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.sdp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            ProfileOptionRow("My Account", R.drawable.person)
            ProfileOptionRow("Restore Purchase", R.drawable.setting)
        }
    }
}

@Composable
fun ProfileOptionRow(text: String, imageRes: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { /* Action here */ },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier
                    .size(16.sdp)
                    .clip(CircleShape) // Optional: Circle image shape
            )
            Spacer(modifier = Modifier.width(15.sdp))
            Text(text = text, color = Color.White, fontSize = 16.ssp)
        }
        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(19.sdp)
        )
    }
}


@Composable
fun ProfileOptionsBox1() {
    Box(
        modifier = Modifier
            .padding(horizontal = 20.sdp)
            .fillMaxWidth()
            .height(140.sdp)
            .background(
                color = Color(0x33FFFFFF),
                shape = RoundedCornerShape(16.sdp)
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.sdp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            ProfileOptionRow1("Support Us", R.drawable.like)
            ProfileOptionRow1("Privacy Policy", R.drawable.privacy)
            ProfileOptionRow1("Terms of Use", R.drawable.terms)
        }
    }
}

@Composable
fun ProfileOptionRow1(text: String, imageRes: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { /* Action here */ },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null, // Accessibility के लिए यहाँ विवरण दे सकते हैं
                modifier = Modifier
                    .size(16.sdp)
                    .clip(CircleShape) // Optional: Circle image shape
            )
            Spacer(modifier = Modifier.width(15.sdp))
            Spacer(modifier = Modifier.width(8.sdp))
            Text(text = text, color = Color.White, fontSize = 16.ssp)
        }
        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(19.dp)
        )
    }
}

