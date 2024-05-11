package com.example.myapplication

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Entity::class], version = 1, exportSchema = false)
abstract class myDatabase : RoomDatabase() {
    abstract fun dao(): DAO?
}