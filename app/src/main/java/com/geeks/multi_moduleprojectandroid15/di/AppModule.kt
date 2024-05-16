package com.geeks.multi_moduleprojectandroid15.di

import android.content.Context
import com.geeks.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context) =
        AppDatabase.createDatabase(context)

    @Provides
    @Singleton
    fun provideUserDao(database: AppDatabase) = database.userDao
}