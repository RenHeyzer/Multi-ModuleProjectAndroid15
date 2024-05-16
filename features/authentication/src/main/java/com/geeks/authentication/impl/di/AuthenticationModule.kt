package com.geeks.authentication.impl.di

import com.geeks.authentication.impl.data.repositories.AuthenticationDataRepository
import com.geeks.authentication.impl.domain.repositories.AuthenticationRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
internal interface AuthenticationModule {

    @Binds
    fun authenticationRepository(repositoryImpl: AuthenticationDataRepository): AuthenticationRepository
}