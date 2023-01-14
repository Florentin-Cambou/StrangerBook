package com.wiapp.strangerbook.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Post(
    val user: User,
    @DrawableRes val postImage: Int,
    @StringRes val description: Int,
    val comments: Int,
    val likes: Int,
    val didLike: Boolean
)
