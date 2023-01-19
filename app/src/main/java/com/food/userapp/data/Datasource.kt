package com.food.userapp.data

import com.food.userapp.R
import com.food.userapp.model.Restaurant

object Datasource {
    fun loadRestaurants(): List<Restaurant> {
        return listOf<Restaurant>(
            Restaurant(R.drawable.bella),
            Restaurant(R.drawable.faye),
            Restaurant(R.drawable.frankie),
            Restaurant(R.drawable.koda),
            Restaurant(R.drawable.leroy),
            Restaurant(R.drawable.lola),
            Restaurant(R.drawable.moana),
            Restaurant(R.drawable.nox),
            Restaurant(R.drawable.tzeitel),
        )
    }
}