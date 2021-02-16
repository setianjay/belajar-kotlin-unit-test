package belajar.kotlin.unit.test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

/*
* Note :
* @DisplayName = Di gunakan untuk mengcustom nama Test baik nama class nya ataupun nama methodnya.
*
* @Test = Di gunakan untuk mengetest suatu method atau function.
*
* @Disabled = Menonaktifkan Test apabila method atau function di rasa masih dalam pengerjaan,
* namun akan tetap masuk report(laporan) bahwa function ini masih dalam tahap pengerjaan.
*
* @BeforeEach = fungsi yang mana dieksekusi sebelum Test. BeforeEach akan dijalankan apabila Test
* dijalankan.
*
* @AfterEach = fungsi yang mana dieksekusi sesudah Test. AfterEach akan dijalankan apabila test
* dijalankan.
*
* */

@DisplayName("Test for Class Calculator")
class CalculatorTest {
    val calculator = Calculator()

    @BeforeEach
    fun beforeEach(){
        println("Sebelum test")
    }

    @AfterEach
    fun afterEach(){
        println("Sesudah Test")
    }

    @DisplayName("Test for Method plus(10,10)")
    @Test
    fun testPlusSuccess(){
        println("testPlusSuccess() dijalankan")
        val result = calculator.plus(10,10)
        assertEquals(20,result,"Hasil harusnya 30")
    }

    @DisplayName("Test for Method plus(10,20)")
    @Test
    fun testPlusSuccess2(){
        println("testPlusSuccess2() dijalankan")
        val result = calculator.plus(10,20)
        assertEquals(30,result,"Hasil harusnya 30")
    }

    @Test
    fun testDivideSuccess(){
        println("testDivideSuccess() dijalankan")
        val result = calculator.divide(20,10)
        assertEquals(2,result,"Hasil harusnya")
    }

    @Test
    fun testDivideError(){
        println("testDivideError() dijalankan")
        assertThrows<IllegalArgumentException> {
            calculator.divide(20,0)
        }
    }

    @Test
    @Disabled
    fun testComingSoon(){
        assertDoesNotThrow {
            calculator.divide(20,2)
        }
    }
}