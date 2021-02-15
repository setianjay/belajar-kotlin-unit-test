package belajar.kotlin.unit.test

import org.junit.jupiter.api.Test

class CalculatorTest {
    val calculator = Calculator()

    @Test
    fun testPlusSuccess(){
        calculator.plus(10,20)
    }

    @Test
    fun testPlusSuccess2(){
        calculator.plus(10,20)
    }
}