package academy.learnprogramming.declarations

fun main() {

    val number = 25
    var x: Int = 10
    println(x)

    val employee1 = Employee(name = "John", id = 1234)
    println(employee1.name)
    employee1.name = "Johnny Smith"
    println(employee1.name)

    val employee2: Employee
    val y = 100
    if (y > number) {
        employee2 = Employee("Jane Smith", 400)
        println(employee2.name)
    } else {
        employee2 = Employee("Jorge Watson", 123)
        println(employee2.name)
    }

    val employee3: Set<Employee>

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[2])

}

class Employee(var name: String, val id: Int) {

}