package com.sdanko.notesappmvvm.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.sdanko.notesappmvvm.navigation.NotesNavHost
import com.sdanko.notesappmvvm.ui.theme.NotesAppMVVMTheme

@Composable
fun Start(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)

    ) {
        Text(text = "Notes App Screen")
    }
}

@Preview(showBackground = true)
@Composable
fun NotesNavHostPreview() {
    NotesAppMVVMTheme {
        Start(navController = rememberNavController())
    }
}
