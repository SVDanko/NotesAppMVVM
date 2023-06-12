package com.sdanko.notesappmvvm

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdanko.notesappmvvm.navigation.NotesNavHost
import com.sdanko.notesappmvvm.ui.theme.NotesAppMVVMTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NotesAppMVVMTheme {

                Scaffold(
                    modifier = Modifier,
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = "Notes App")
                            },
                        )
                    },
                    content = {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            NotesNavHost()
                        }
                    }
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun NotesNavHostPreview() {
    NotesAppMVVMTheme {
        NotesNavHost()
    }
}