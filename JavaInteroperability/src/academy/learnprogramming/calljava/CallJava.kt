package academy.learnprogramming.calljava

import academy.learnprogramming.javacode.Car

fun main() {

    val car = Car("blue", "ford", 2015)
    car.color = "green"
    println(car)

    car.color = "red"
    println(car)

    var model = car.model
    println(model.javaClass)
    model = null
    println()

}