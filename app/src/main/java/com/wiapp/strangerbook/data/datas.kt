package com.wiapp.strangerbook.data

import com.wiapp.strangerbook.model.Post
import com.wiapp.strangerbook.model.User
import com.wiapp.strangerbook.R

val lucas = User(pseudo = "Lucas", pictureProfile = R.drawable.lucas)
val eleven = User(pseudo = "Eleven", pictureProfile = R.drawable.eleven)
val eddie = User(pseudo = "Eddie", pictureProfile =  R.drawable.eddie)


val bats = Post(user = eddie, postImage = R.drawable.bats, description = R.string.desc1 , likes = 90, comments = 0, didLike = false)
val crush = Post(user = lucas, postImage = R.drawable.crush, description = R.string.desc2, likes = 88, comments = 4, didLike = true)
val father = Post(user = eleven, postImage = R.drawable.father, description = R.string.desc3, likes = 13, comments = 12, didLike = true)
val fireworks = Post(user = eleven, postImage = R.drawable.fireworks, description = R.string.desc4, likes = 64, comments = 34, didLike = false)
val grass = Post(user = lucas, postImage = R.drawable.grass, description = R.string.desc5, likes = 83, comments = 4, didLike = false)
val haircut = Post(user = eddie, postImage = R.drawable.haircut, description = R.string.desc6, likes = 16, comments = 8, didLike = false)
val marine = Post(user = lucas, postImage = R.drawable.marine, description = R.string.desc7, likes = 45, comments = 56, didLike = false)
val roller = Post(user = eleven, postImage = R.drawable.roller, description = R.string.desc8, likes = 98, comments = 29, didLike = false)
val snow = Post(user = eleven, postImage = R.drawable.snow, description = R.string.desc9, likes = 323, comments = 1, didLike = false)
val vecna = Post(user = eddie, postImage = R.drawable.vecna, description = R.string.desc10, likes = 456, comments = 79, didLike = false)

fun allPosts(): List<Post> {
    return listOf(bats, crush, father, fireworks, grass, haircut, marine, roller, snow, vecna)
}
