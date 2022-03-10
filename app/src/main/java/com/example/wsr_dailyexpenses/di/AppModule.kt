package com.example.wsr_dailyexpenses.di

import android.app.Application
import androidx.room.Room
import com.example.wsr_dailyexpenses.data.ItemToBuyDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application) =
        Room.databaseBuilder(app, ItemToBuyDatabase::class.java, "itemToBuy_database")
            .fallbackToDestructiveMigration()
            .build()
}