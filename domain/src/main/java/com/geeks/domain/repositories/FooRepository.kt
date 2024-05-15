package com.geeks.domain.repositories

import com.geeks.common.Either
import com.geeks.domain.entities.Foo
import kotlinx.coroutines.flow.Flow

interface FooRepository {

    suspend fun getFoo(): Flow<Either<Throwable, List<Foo>>>
}