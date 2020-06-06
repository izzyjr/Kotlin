package academy.learnprogrammming.lambdas

import kotlin.text.StringBuilder

fun main() {

//    println(countTo100Four())

    val employees = listOf(Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )

    findByLastNameTwo(employees, "Wilson")
//    findByLastNameTwo(employees, "Smith")

    "Some String".apply someString@{
        "Another String".apply {
            println(this.toUpperCase())
            println(this@someString.toLowerCase())
        }
    }

}

fun findByLastNameTwo(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("$lastName exists")
            return@returnBlock
        }
    }
    println("$lastName does not exist")
}

fun findByLastNameOne(employees: List<Employee>, lastName: String) {
    for (employee in employees) {
        if (employee.lastName == lastName) {
            println("${employee.lastName} exists")
            return
        }
    }
    println("$lastName does not exist")
}

fun countTo100Four() =
    StringBuilder().apply() {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }.toString()

fun countTo100Three() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }

fun countTo100Two(): String {
    val numbers = StringBuilder()
    return with(numbers) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}

fun countTo100One(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}