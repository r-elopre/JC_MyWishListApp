package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val tittle: String = "",
    @ColumnInfo(name = "wish-description")
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