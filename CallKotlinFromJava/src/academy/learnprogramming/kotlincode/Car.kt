@file: JvmName("StaticCar")

package academy.learnprogramming.kotlincode

fun topLevel() = println("I'm in the Car file!")

fun main() {

    "Print This".print()

}

fun String.print() {
    println(this)
}

class Car(var color: String, @JvmField val model: String, val year: Int, val automatic: Boolean) {
}