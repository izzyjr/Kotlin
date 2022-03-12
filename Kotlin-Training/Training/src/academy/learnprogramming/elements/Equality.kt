package academy.learnprogramming.elements

fun main() {

    val employee1 = Employee(name = "Mary", id = 1)
    val employee2 = Employee(name = "John", id = 2)
    val employee3 = Employee(name = "John", id = 2)
    println(employee1 == employee2)
    println(employee2 == employee3)
    println(employee1 === employee2)
    println(employee2 === employee3)
    println(employee1.equals(employee2))
    println(employee2.equals(employee3))
    val employee4 = employee2
    println(employee4 === employee2)
    println(employee4 != employee2)
    println(employee2 != employee3)
    println(employee2 !== employee3)

}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }

}