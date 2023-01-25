package com.food.userapp.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.food.userapp.ui.theme.UserAppTheme

@Composable
fun MyOrderScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {

        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Icon(
                imageVector = Icons.Outlined.KeyboardArrowLeft,
                contentDescription = null,
                tint = MaterialTheme.colors.onSurface,
                modifier = modifier.size(30.dp)
            )

            Text(
                text = "My Order",
                style = MaterialTheme.typography.h6,
                color = MaterialTheme.colors.onSurface
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MyOrderScreenLightThemePreview() {
    UserAppTheme(darkTheme = false) {
        MyOrderScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun MyOrderScreenDarkThemePreview() {
    UserAppTheme(darkTheme = true) {
        MyOrderScreen()
    }
}