package com.example.astromagic.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.astromagic.presentation.ui.screen.profiledate.ProfileDate
import com.example.astromagic.ui.theme.AstromagicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AstromagicTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   innerPadding
                    ControlNav()
                }
            }
        }
    }
}

