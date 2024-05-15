package com.geeks.common

sealed class Either<L, R> {

    data class Left<L>(val error: L? = null): Either<L, Nothing>()
    data class Right<R>(val data: R? = null): Either<Nothing, R>()
}