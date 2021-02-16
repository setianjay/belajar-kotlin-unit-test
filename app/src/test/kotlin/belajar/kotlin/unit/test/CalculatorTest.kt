package belajar.kotlin.unit.test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

@DisplayName("Test for Class Calculator")
class CalculatorTest {
    val calculator = Calculator()

    @DisplayName("Test for Method plus(10,10)")
    @Test
    fun testPlusSuccess(){
        val result = calculator.plus(10,10)
        assertEquals(20,result,"Hasil harusnya 30")
    }

    @DisplayName("Test for Method plus(10,20)")
    @Test
    fun testPlusSuccess2(){
        val result = calculator.plus(10,20)
        assertEquals(30,result,"Hasil harusnya 30")
    }

    @Test
    fun testDivideSuccess(){
        val result = calculator.divide(20,10)
        assertEquals(2,result,"Hasil harusnya")
    }

    @Test
    fun testDivideError(){
        assertThrows<IllegalArgumentException> {
            calculator.divide(20,0)
        }
    }
}