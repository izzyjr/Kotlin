package academy.learnprogramming.elements.five

fun main() {

    val emp = Employee("John")
    println(emp)

    val emp2 = Employee("Joe", false)
    println(emp2)

    emp2.fullTime = true
    println(emp2.fullTime)

}

private class Employee (val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
    get() {
        println("Running the custom get")
        return field
    }

    set(value) {
        println("Running the custom set")
        field = value
    }

}