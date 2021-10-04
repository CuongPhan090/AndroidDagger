package com.example.b32dagger.di.module

import com.example.b32dagger.data.Color
import dagger.Module
import dagger.Provides

// where we declare all dependency
@Module
class ApplicationModule {

    // this is a dependency provider
    @Provides
    fun provideColor(): Color {
        return Color("R", "G", "B")
    }
}