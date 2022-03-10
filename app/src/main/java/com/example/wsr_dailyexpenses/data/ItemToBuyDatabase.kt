package com.example.wsr_dailyexpenses.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ItemToBuy::class], version = 1)
abstract class ItemToBuyDatabase: RoomDatabase() {

    abstract fun itemToBuyDao(): ItemToBuyDao
}