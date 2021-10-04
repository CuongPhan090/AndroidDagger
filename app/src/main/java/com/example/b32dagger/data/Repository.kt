package com.example.b32dagger.data

import android.util.Log
import javax.inject.Inject

// how to create constructor of this repo class
class Repository @Inject constructor(remoteDataSource: RemoteDataSource) {

    init {

        Log.d("RemoteDataSource", "$remoteDataSource")
    }
}