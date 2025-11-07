package com.example.questnavigastugas_223

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.questnavigastugas_223.ui.theme.QuestNavigasTugas_223Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestNavigasTugas_223Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DataApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}