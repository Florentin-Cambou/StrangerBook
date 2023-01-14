package com.wiapp.strangerbook.model

import androidx.annotation.DrawableRes

data class User(
    val pseudo: String,
    @DrawableRes val pictureProfile: Int
)
