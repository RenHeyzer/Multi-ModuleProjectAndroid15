package com.geeks.authentication.impl.domain.usecases

import com.geeks.authentication.api.domain.entities.User
import com.geeks.authentication.impl.domain.entities.LoginField
import com.geeks.authentication.impl.domain.exceptions.EmptyFiledException
import com.geeks.authentication.impl.domain.repositories.AuthenticationRepository
import javax.inject.Inject

internal class LoginUseCase @Inject constructor(
    private val authenticationRepository: AuthenticationRepository
) {

    suspend operator fun invoke(email: String, password: String): User? {
        if (email.isEmpty()) throw EmptyFiledException(LoginField.EMAIL)
        if (password.isEmpty()) throw EmptyFiledException(LoginField.PASSWORD)
        val user = authenticationRepository.getUserInfo()
        return if (email == user.username && password == user.password) {
            user
        } else {
            null
        }
    }
}