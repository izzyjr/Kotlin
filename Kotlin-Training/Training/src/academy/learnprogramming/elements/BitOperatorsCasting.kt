package academy.learnprogramming.elements

fun main() {

    // Bit Operators
    val x = 0x00101101
    val y = 0x11011011

    x or y
    x and y

    // Casting
    val something: Any = Employee("Jose", 2)

    if (something !is Employee) {
        println("not an employee")
    } else {
        // because of smart casting no casting needed
        val newEmployee = something //as Employee
        println("My name is " + newEmployee.name)
    }

    if (something is Employee) {
        something.name = "Jose is an Employee"
        println(something.name)
    }




}