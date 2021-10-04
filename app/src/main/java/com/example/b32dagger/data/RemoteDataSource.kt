package com.example.b32dagger.data

import android.util.Log
import com.example.b32dagger.di.component.ApplicationComponent
import com.example.b32dagger.di.component.DaggerApplicationComponent
import com.example.b32dagger.di.module.ApplicationModule
import javax.inject.Inject


class RemoteDataSource @Inject constructor () {

    @Inject
    lateinit var color: Color

    init {
        val daggerApplicationComponent: ApplicationComponent =
            DaggerApplicationComponent.builder().applicationModule(
                ApplicationModule()).build()

        daggerApplicationComponent.inject(this)
        Log.d("remoteDataSource", "$color")
    }
}