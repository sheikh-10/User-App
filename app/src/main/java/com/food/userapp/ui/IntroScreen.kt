package com.food.userapp.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.food.userapp.R
import com.food.userapp.ui.theme.UserAppTheme

@Composable
fun IntroScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.background(MaterialTheme.colors.background)) {
        Card(modifier = modifier
            .weight(1f)
            .fillMaxSize(),
            elevation = 4.dp,
            shape = RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp, bottomStart = 30.dp, bottomEnd = 30.dp)
            ) {
            Column(modifier = modifier
                .wrapContentSize(align = Alignment.Center)
                .padding(32.dp),
            verticalArrangement = Arrangement.spacedBy(48.dp)
                ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_fork),
                    contentDescription = null,
                    modifier = modifier
                        .fillMaxWidth()
                        .wrapContentWidth(align = Alignment.CenterHorizontally)
                        .size(150.dp)
                    )

                Text(text = "ORDER FOOD", style = MaterialTheme.typography.h1,
                    modifier = modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.CenterHorizontally),
                    color = MaterialTheme.colors.onSurface)
            }
        }

        Column(modifier = modifier
            .fillMaxSize()
            .weight(1f)) {

            Text(text = "Find The Food For You",
                style = MaterialTheme.typography.h2,
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.CenterHorizontally)
                    .weight(1f)
                    .padding(top = 100.dp),
                color = MaterialTheme.colors.onSurface)

            Text(
                text = "We make it simple to find a food for you. enter your address and let us do the rest",
                modifier = modifier
                    .padding(horizontal = 32.dp)
                    .weight(1f),
                textAlign = TextAlign.Justify,
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.body1
                )

            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.End)
                    .padding(bottom = 30.dp, end = 30.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                Text(text = "LOGIN",
                    color = MaterialTheme.colors.onSurface,
                    style = MaterialTheme.typography.h2
                    )

                Card(elevation = 2.dp, shape = RoundedCornerShape(50)) {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Outlined.KeyboardArrowRight, contentDescription = null)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun IntroScreenLightThemePreview() {
    UserAppTheme(darkTheme = false) {
        IntroScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun IntroScreenDarkThemePreview() {
    UserAppTheme(darkTheme = true) {
        IntroScreen()
    }
}