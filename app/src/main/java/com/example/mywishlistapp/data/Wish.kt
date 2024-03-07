package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val tittle: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(tittle = "Google watch", description = "an android watch"),
        Wish(tittle = "Google car", description = "an android car"),
        Wish(tittle = "Google hat", description = "an android hat"),
        Wish(tittle = "Google job", description = "an android job"),
    )
}