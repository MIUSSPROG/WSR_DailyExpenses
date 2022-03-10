package com.example.wsr_dailyexpenses.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemToBuyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(itemTuBuy: ItemToBuy)

    @Update
    suspend fun update(itemTuBuy: ItemToBuy)

    @Delete
    suspend fun delete(itemToBuy: ItemToBuy)

    @Query("SELECT * FROM ItemToBuy WHERE date = :pickDate")
    fun getAllItems(pickDate: Long): Flow<List<ItemToBuy>>

}