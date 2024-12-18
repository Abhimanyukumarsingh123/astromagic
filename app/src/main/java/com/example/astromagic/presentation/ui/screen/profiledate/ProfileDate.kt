package com.example.astromagic.presentation.ui.screen.profiledate

import androidx.compose.runtime.Composable
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import com.example.astromagic.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

import androidx.compose.foundation.clickable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import com.example.astromagic.Utils.NavigationRoutes
import java.util.Calendar

@Composable
fun ProfileDate(navController: NavHostController) {
    val blueGradient = Brush.verticalGradient(
        colors = listOf(Color(0xfff15a97), Color(0xff7a4f9f))
    )
    val selectedDate = remember { mutableStateOf("DD/MM/YYYY") }
    val context = LocalContext.current

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
                text = "It is a numerical \n" +
                        "game",
                modifier = Modifier.padding(start = 40.sdp, end = 40.sdp),
                style = TextStyle(
                    color = Color.White, fontSize = 23.ssp,
                ),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.padding(top = 15.sdp))
            Image(
                painter = painterResource(id = R.drawable.viewer),
                contentDescription = null,
                modifier = Modifier.size(50.sdp)
            )
            Spacer(modifier = Modifier.padding(top = 15.sdp))
            Text(
                text = "3/5",
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 20.sdp),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 15.ssp,
                ),
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
                    .height(450.sdp)
                    .clip(RoundedCornerShape(topStart = 22.sdp, topEnd = 22.sdp))
                    .background(color = Color(0xffffffff))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profilesimg),
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
                        text = "Astrology is all about\n" +
                                " calculations.",
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(start = 20.sdp),
                        style = TextStyle(
                            blueGradient,
                            fontSize = 29.ssp,
                            fontWeight = FontWeight.Bold,
                        ),
                    )
                    Spacer(modifier = Modifier.padding(top = 17.sdp))
                    Text(
                        text = "Hi, Adam",
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(start = 20.sdp),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 14.ssp,
                        ),
                    )
                    Text(
                        text = "Enter your date of birth",
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
                            color = Color.Black, fontSize = 11.ssp, fontStyle = FontStyle.Italic
                        ),
                    )
                    Spacer(modifier = Modifier.padding(top = 22.sdp))
                    Box(

                        modifier = Modifier
                            .padding(start = 25.sdp, end = 25.sdp)
                            .size(width = 310.sdp, height = 43.sdp)
                            .background(color = Color(0xffD7D7D7), shape = RoundedCornerShape(30.sdp))
                            .padding(start = 8.sdp, end = 8.sdp) // Padding for text and end image
                            .clickable {
                                showDatePicker(context) { date ->
                                    selectedDate.value = date
                                }
                            }
                            .padding(vertical = 12.sdp, horizontal = 12.sdp)
                    ) {
                        Text(
                            text = selectedDate.value,
                            color = if (selectedDate.value == "DD/MM/YYYY") Color(0xFFA6A6A6) else Color.Black,
                            fontSize = 12.ssp
                        )
                        Image(
                            painter = painterResource(id = R.drawable.colendericon), // Replace with your image resource
                            contentDescription = "Calendar Icon",
                            modifier = Modifier
                                .align(Alignment.CenterEnd)
                                .size(20.sdp)
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 22.sdp))
                    Button(
                        onClick = {
                            navController.navigate(NavigationRoutes.PROFILETIME) {
                                popUpTo(NavigationRoutes.PROFILEDATE ) { inclusive = true }
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
                            text = "Next", fontSize = 12.ssp, fontWeight = FontWeight.Bold
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


fun showDatePicker(context: android.content.Context, onDateSelected: (String) -> Unit) {
    val calendar = Calendar.getInstance()
    val datePickerDialog = android.app.DatePickerDialog(
        context,
        { _, year, month, dayOfMonth ->
            val formattedDate = String.format("%02d/%02d/%04d", dayOfMonth, month + 1, year)
            onDateSelected(formattedDate)
        },
        calendar.get(Calendar.YEAR),
        calendar.get(Calendar.MONTH),
        calendar.get(Calendar.DAY_OF_MONTH)
    )
    datePickerDialog.show()
}