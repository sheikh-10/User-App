package com.food.userapp.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.food.userapp.ui.theme.UserAppTheme

@Composable
fun SplashScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize().background(MaterialTheme.colors.background)
        .wrapContentSize(align = Alignment.Center)) {
        Text(text = "User App",
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onSurface,
            fontSize = 40.sp)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SplashScreenLightThemePreview() {
    UserAppTheme(darkTheme = false) {
        SplashScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun SplashScreenDarkThemePreview() {
    UserAppTheme(darkTheme = true) {
        SplashScreen()
    }
}