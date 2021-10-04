package com.example.b32dagger.di.component

import com.example.b32dagger.MainActivity
import com.example.b32dagger.data.RemoteDataSource
import com.example.b32dagger.di.module.ApplicationModule
import dagger.Component

// tell dagger to use dependency from provided module and inject to where? -> activity
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(remoteDataSource: RemoteDataSource)
}