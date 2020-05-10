package academy.learnprogramming.elements.five

fun main() {

    println(labelMultiply(3, 4))
    println(labelMultiply(label = "out of order", operand2 = 4, operand = 3))

    val emp1 = Employee2("Jayson")
    println(emp1.upperCaseFirstName())



}

fun labelMultiply(operand: Int, operand2: Int, label: String = "The answer is:"): String =
    "$label ${operand * operand2}"

class Employee2(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase()

}