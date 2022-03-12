@file: JvmName("KotlinStuff")

package academy.learnprogramming.challenge9.kotlincode

import academy.learnprogramming.challenge9.javacode.Employee

fun main() {

    val employee = Employee("Jane", "Smith", 2000)

    employee.lastName = "Jones"
    employee.salaryLast3Years = floatArrayOf(50000.25F, 50000.60F, 56800.42F)

}

fun sayHelloToJava(name: String) {
    println("Kotlin says hello to Java and $name!")
}

object Challenge {
    @JvmStatic fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class KotlinEmployee(val firstName: String, val lasName: String, @JvmField var startYear: Int) {

    @JvmOverloads fun takesDefault(parm1: String, parm2: String = "default") {
        println("$parm1 and $parm2")
    }
}