package com.geeks.authentication.api.domain.entities

data class User(
    val id: Long,
    val username: String,
    val email: String,
    val password: String
)