package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "card_info_table")
data class CardInfo(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    var title: String,
    var priority: String
)
