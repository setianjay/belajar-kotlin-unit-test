package belajar.kotlin.unit.test

import java.lang.IllegalArgumentException

class Calculator {

    fun plus(paramsFirst: Int, paramsSecond: Int): Int = paramsFirst + paramsSecond

    fun divide(paramsFirst: Int, paramsSecond: Int): Int {
        if (paramsSecond == 0) {
            throw IllegalArgumentException("Can't divide by zero")
        } else {
            return paramsFirst / paramsSecond
        }
    }
}