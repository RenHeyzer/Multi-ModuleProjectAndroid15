package com.geeks.authentication.impl.domain.repositories

import com.geeks.authentication.api.domain.entities.User

internal interface AuthenticationRepository {

    suspend fun getUserInfo(): User
    suspend fun signUp(user: User): Long
}