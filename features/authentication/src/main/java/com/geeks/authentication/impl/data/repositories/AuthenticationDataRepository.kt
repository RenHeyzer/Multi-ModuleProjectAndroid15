package com.geeks.authentication.impl.data.repositories

import com.geeks.authentication.api.domain.entities.User
import com.geeks.authentication.impl.data.mappers.toDBO
import com.geeks.authentication.impl.data.mappers.toEntity
import com.geeks.authentication.impl.domain.repositories.AuthenticationRepository
import com.geeks.database.daos.UserDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

internal class AuthenticationDataRepository @Inject constructor(
    private val userDao: UserDao
) : AuthenticationRepository {

    override suspend fun getUserInfo() = withContext(Dispatchers.IO) {
        userDao.getUserInfo().toEntity()
    }

    override suspend fun signUp(user: User): Long {
        return withContext(Dispatchers.IO) {
            userDao.insertUser(user.toDBO())
        }
    }
}