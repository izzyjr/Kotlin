package academy.learnprogramming.elements.five

fun main() {

    val emp = Employee("John")
    println(emp)

    val emp2 = Employee("Joe", false)
    println(emp2)

}

private class Employee (val firstName: String, var fullTime: Boolean = true) {

    override fun toString(): String {
        return "Employee(firstName='$firstName', fullTime=$fullTime)"
    }
}