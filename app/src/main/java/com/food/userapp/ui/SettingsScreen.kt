package com.food.userapp.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.food.userapp.ui.theme.UserAppTheme

@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {

        Row(modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {

            Icon(imageVector = Icons.Outlined.KeyboardArrowLeft,
                contentDescription = null,
                tint = MaterialTheme.colors.onSurface,
                modifier = modifier.size(30.dp))

            Text(text = "Settings",
                style = MaterialTheme.typography.h6,
                color = MaterialTheme.colors.onSurface)
        }

        SettingsButton(text = "My Orders")

        Divider(modifier = modifier.fillMaxWidth())

        SettingsButton(text = "History")
        Divider(modifier = modifier.fillMaxWidth())

        SettingsButton(text = "Add new address")
        Divider(modifier = modifier.fillMaxWidth())

        SettingsButton(text = "Log out")
    }
}

@Composable
private fun SettingsButton(modifier: Modifier = Modifier, text: String) {
    Row(modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

        Icon(imageVector = Icons.Outlined.Menu,
            contentDescription = null,
            modifier = modifier,
            tint = MaterialTheme.colors.onSurface
            )

        Text(text = text,
            style = MaterialTheme.typography.h6,
            modifier = modifier
                .wrapContentWidth(align = Alignment.Start),
            color = MaterialTheme.colors.onSurface)

        Icon(imageVector = Icons.Outlined.KeyboardArrowRight,
            contentDescription = null,
            modifier = modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.End),
            tint = MaterialTheme.colors.onSurface)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SettingsScreenLightThemePreview() {
    UserAppTheme(darkTheme = false) {
        SettingsScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun SettingsScreenDarkThemePreview() {
    UserAppTheme(darkTheme = true) {
        SettingsScreen()
    }
}