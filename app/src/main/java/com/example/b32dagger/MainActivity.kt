package com.example.b32dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.b32dagger.data.Color
import com.example.b32dagger.di.component.ApplicationComponent
import com.example.b32dagger.di.component.DaggerApplicationComponent
import com.example.b32dagger.di.module.ApplicationModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var color: Color

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerApplicationComponent: ApplicationComponent = DaggerApplicationComponent.builder().applicationModule(
            ApplicationModule()).build()
        daggerApplicationComponent.inject(this)

        Log.d("Injection", "$color")
    }
}