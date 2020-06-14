@file: JvmName("StaticCar")

package academy.learnprogramming.kotlincode

import java.io.IOException

fun topLevel() = println("I'm in the Car file!")

fun main() {

    "Print This".print()

}

@JvmOverloads fun defaultArgs(str: String, num: Int = 25) {
    println("$str - $num")
}

@Throws(IOException::class)
fun doIO() {
    throw IOException()
}

object SingletonObject {
    @JvmStatic fun doSomething() = println("I'm doing something in the singleton object")
}

fun String.print() {
    println(this)
}

class Car(var color: String, @JvmField val model: String, val year: Int, val automatic: Boolean) {


    companion object {
        const val constant = 25
        @JvmField val isAuto = false
        @JvmStatic fun carComp() = println("I'm in the Car's companion object")
    }

    fun printMe(text: String) {
        println("I don't expect a null value: $text")
    }

}