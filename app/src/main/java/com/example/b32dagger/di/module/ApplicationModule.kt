package com.example.b32dagger.di.module

import com.example.b32dagger.data.Car
import com.example.b32dagger.data.Color
import com.example.b32dagger.data.Engine
import dagger.Module
import dagger.Provides
import javax.inject.Named

// where we declare all dependency
@Module
class ApplicationModule {

    // this is a dependency provider
    @Provides
    fun provideColor(@Named("anotherString") redColor: String): Color {
        return Color(redColor, "G", "B")
    }

    @Provides
    fun provideEngine(color: Color): Engine {
        return Engine("Model1", 1000.0, color)
    }

    @Provides
    fun provideCar(engine: Engine, color: Color,@Named("carTitle") carTitle: String): Car {
        return Car(carTitle, engine, color)
    }

    @Named("carTitle")
    @Provides
    fun provideString(): String {
        return "fold mustang"
    }

    @Named("anotherString")
    @Provides
    fun provideAnotherString(): String {
        return "this is another string"
    }

}