package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
/**
 * The MainActivity class.
 */
class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var kelvinMath = KelvinMath()
        var result = kelvinMath.addition(1, 2)
        Log.d(TAG, "kelvin test result = ${result.toString()}")
    }
}

/**
 * The KelvinMath class. Used to perform basic mathematical operation.
 */
class KelvinMath {
    companion object {
        private val TAG = KelvinMath::class.java.simpleName
    }

    /**
     * Perform addition of two integer numbers.
     */
    fun addition(a: Int, b: Int): Int{
        var c = a+b
        return c
    }
}