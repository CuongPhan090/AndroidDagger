package com.example.b32dagger.di.component

import com.example.b32dagger.MainActivity
import com.example.b32dagger.di.module.ApplicationModule
import dagger.Component

// tell dagger to use dependency from provided module and inject to activity
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}