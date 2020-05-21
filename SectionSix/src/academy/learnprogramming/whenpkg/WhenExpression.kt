package academy.learnprogramming.whenpkg

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main() {

    val timeOfYear = Season.SPRING
    val str = when (timeOfYear) {
        Season.SPRING -> "Flowers are blooming"
        Season.SUMMER -> "It's really hot"
        Season.FALL -> "Halloween time"
        Season.WINTER -> "Christmas time"
    }
    println(str)

    val num = 200

    when(num) {
        100 -> println("100")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }

    val num1 = 234

    when(num1) {
        in 100..600 -> println("in range 100..600")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }

    val num2 = 600

    when(num2) {
        100, 600 -> println("6000")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }

    val num3 = 100
    val y = 10

    when(num3) {
        y + 80 -> println("90")
        y + 90 -> println("100")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }

    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(25.3)
    val obj3: Any = 45

    val something: Any = obj2

    if (something is String) {
        println(something.toUpperCase())
    } else if (something is BigDecimal) {
        println(something.remainder(BigDecimal(10.5)))
    } else if (something is Int) {
        println(something - 22)
    }

    val z = when (something) {
        is String -> {
            println(something.toUpperCase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println(something - 22)
            3
        }
        else -> {
            println("We out here")
            4
        }
    }
    println(z)

    var x = 5
    var w = 6

    if (x > w) {
        println("x is greater than w")
    } else if (x < w) {
        println("x is less than w")
    } else {
        println("x equals w")
    }

    when {
        x > w -> println("x is greater than w")
        x < w -> println("x is less than w")
        else -> println("x equals w")
    }

}