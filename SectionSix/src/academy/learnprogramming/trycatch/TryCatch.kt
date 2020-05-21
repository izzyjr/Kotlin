package academy.learnprogramming.trycatch

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.math.BigDecimal

fun main() {

    println(getNumber("22.5") ?: IllegalArgumentException("Number isn't an Int"))
    println(getNumber("22.5") ?: "I can't print the result")

}

fun getNumber(str: String): Int?  {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        println(e)
        null
    } finally {
        println("I'm in the finally block")
    }
}

