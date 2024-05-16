package com.geeks.authentication.impl.data.mappers

import com.geeks.authentication.api.domain.entities.User
import com.geeks.database.entities.UserDBO

fun User.toDBO() = UserDBO(
    id = id,
    username = username,
    email = email,
    password = password
)

fun UserDBO.toEntity() = User(
    id = id,
    username = username,
    email = email,
    password = password
)
