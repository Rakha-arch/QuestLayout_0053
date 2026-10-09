package com.example.day3prak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
// 💡 PERBAIKAN 1: Impor tema yang benar sesuai nama package day3prak
import com.example.day3prak.ui.theme.Day3prakTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // 💡 PERBAIKAN 1: Menggunakan tema Day3prakTheme
            Day3prakTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // 💡 PERBAIKAN 2: Menggunakan nama 'ActifitasPertama' (pakai 'f' sesuai file UI Anda)
                    // serta meneruskan parameter innerPadding agar modifier Scaffold terpakai
                    ActifitasPertama(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ActifitasPertamaPreview() {
    Day3prakTheme {
        ActifitasPertama(modifier = Modifier)
    }
}
