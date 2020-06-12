package academy.learnprogramming.calljava

import academy.learnprogramming.javacode.Car

fun main() {

    val car = Car("blue", "ford", 2015, "anObject")
    car.color = "green"
    println(car)

    car.color = "red"
    println(car)

    var model: String? = car.model
    println(model)


    val car2 = Car("red", "ferrari", 1988, "anObject")
    var model2: String? = car.model
    //println(model2.javaClass)
    model2 = null
    println(model2)

    car2.variableMethod(5, "hello", "goodbye")
    val strings = arrayOf("hello", "goodbye")
    car.variableMethod(10, *strings)
    car.wantsIntArray(arrayOf(1, 2, 3).toIntArray())
    car.wantsIntArray(intArrayOf(12, 4, 5))

//    (car.javaObject as java.lang.Object).wait()

    println("x = ${Car.x}")
    println(Car.xString())
    car.demoMethod { println("I'm in a thread!") }


}