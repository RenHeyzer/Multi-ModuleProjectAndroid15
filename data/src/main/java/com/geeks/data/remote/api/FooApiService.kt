package com.geeks.data.remote.api

import com.geeks.data.remote.dtos.FooResponse

interface FooApiService {

    suspend fun fetchFoo(): FooResponse
}