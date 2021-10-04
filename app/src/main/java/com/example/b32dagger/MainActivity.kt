package com.example.b32dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.b32dagger.data.Car
import com.example.b32dagger.data.Color
import com.example.b32dagger.data.Engine
import com.example.b32dagger.data.Repository
import com.example.b32dagger.di.component.ApplicationComponent
import com.example.b32dagger.di.component.DaggerApplicationComponent
import com.example.b32dagger.di.module.ApplicationModule
import javax.inject.Inject

// This is field injection
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var color: Color

    @Inject
    lateinit var engine: Engine

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerApplicationComponent: ApplicationComponent =
            DaggerApplicationComponent.builder().applicationModule(
                ApplicationModule()).build()

        daggerApplicationComponent.inject(this@MainActivity)

        Log.d("Injection", "$color")
        Log.d("Injection", "$engine")
        Log.d("Injection", "$car")

    }
}