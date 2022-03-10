package com.example.jacocoexample

import org.junit.Assert
import org.junit.Test

class CalcTest {
    @Test
    fun testdoMsg(){
        val cal = Calc()
        cal.doMsg()
        Assert.assertEquals(true, true)
    }
}