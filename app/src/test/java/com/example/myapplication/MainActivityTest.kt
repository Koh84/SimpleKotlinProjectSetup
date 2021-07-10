package com.example.myapplication

import org.junit.Test

class MainActivityTest {

    @Test
    fun addition() {
        val kelvinMath = KelvinMath()
        var expected = 5
        var result = kelvinMath.addition(2, 3)
        assert(expected == result)
    }
}
