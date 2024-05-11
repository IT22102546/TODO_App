package com.example.myapplication

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DAO {
    @Insert
    fun insertTask(entity: Entity)

    @Update
    fun updateTask(entity: Entity?)

    @Delete
    fun deleteTask(entity: Entity?)

    @get:Query("SELECT * FROM to_do")
    val tasks: List<CardInfo?>?
}
