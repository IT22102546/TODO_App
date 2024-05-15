package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "To_Do")
data class CardInfo(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    var title: String,
    var priority: String
)
