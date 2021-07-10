package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var result = addition(1, 2)
        Log.d(TAG, "result = ${result.toString()}")
    }

    fun addition(a: Int, b: Int): Int{
        var c = a+b
        return c
    }
}