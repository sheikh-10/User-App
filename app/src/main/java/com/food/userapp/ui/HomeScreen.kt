package com.food.userapp.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.food.userapp.R
import com.food.userapp.data.Datasource
import com.food.userapp.model.Restaurant
import com.food.userapp.ui.theme.UserAppTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
        Row(modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

            Text(text = "Restaurants",
                style = MaterialTheme.typography.h6,
                modifier = modifier.wrapContentWidth(align = Alignment.Start),
                color = MaterialTheme.colors.onSurface)

            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Outlined.Settings, contentDescription = null, modifier = modifier.fillMaxWidth().wrapContentWidth(align = Alignment.End))
            }
        }

        Text(text = "PROFILE",
            style = MaterialTheme.typography.h5,
            color = MaterialTheme.colors.onSurface,
            modifier = modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
            )

        Row(modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically) {

            Column(modifier = modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Card(elevation = 2.dp,
                    shape = RoundedCornerShape(50),
                        ) {

                    Text(text = "Sheikh",
                        style = MaterialTheme.typography.h6,
                        color = MaterialTheme.colors.onSurface,
                        modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                            )
                }
                Text(text = "test@test.com",
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.onSurface)
            }

            Image(painter = painterResource(id = R.drawable.bella),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(50))
                )
        }

        Divider(modifier = modifier.fillMaxWidth())

        Text(text = "RESTAURANTS",
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.onSurface,
            modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        )

        RestaurantList()

        Divider(modifier = modifier.fillMaxWidth())

        Text(text = "MEALS",
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.onSurface,
            modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        )

        RestaurantList()
    }
}

@Composable
private fun RestaurantList(modifier: Modifier = Modifier,
                           restaurants: List<Restaurant> = Datasource.loadRestaurants()) {
    LazyRow(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        items(restaurants) { restaurant ->
            RestaurantCard(restaurant = restaurant)
        }
    }
}

@Composable
private fun RestaurantCard(modifier: Modifier = Modifier,
                           restaurant: Restaurant = Datasource.loadRestaurants()[0]) {
    Card(elevation = 4.dp, shape = RoundedCornerShape(10)) {
        Image(painter = painterResource(id = restaurant.imageResourceId),
            contentDescription = null,
            modifier = modifier.size(150.dp),
            contentScale = ContentScale.Crop
            )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenLightThemePreview() {
    UserAppTheme(darkTheme = false) {
        HomeScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun HomeScreenDarkThemePreview() {
    UserAppTheme(darkTheme = true) {
        HomeScreen()
    }
}