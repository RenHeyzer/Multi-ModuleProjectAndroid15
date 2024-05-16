package com.geeks.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.geeks.database.entities.UserDBO

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    suspend fun getUserInfo(): UserDBO

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: UserDBO): Long

    @Update
    suspend fun updateUser(user: UserDBO)

    @Delete
    suspend fun deleteUser(user: UserDBO)
}