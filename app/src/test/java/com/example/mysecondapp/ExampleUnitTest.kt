package com.example.mysecondapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        val sumFunction:(Int,Int)->Int = { a:Int,b:Int -> sum(a,b)
        }
    }
    fun sum(a:Int,b:Int):Int = a + b
}
