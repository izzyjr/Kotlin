package academy.learnprogramming.calljava

import academy.learnprogramming.javacode.Car

fun main() {

    val car = Car("blue", "ford", 2015)
    car.color = "green"
    println(car)

    car.color = "red"
    println(car)

    var model: String? = car.model
    println(model)


    val car2 = Car("red", "ferrari", 1988)
    var model2: String? = car.model
    //println(model2.javaClass)
    model2 = null
    println(model2)


}