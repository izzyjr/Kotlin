package academy.learnprogramming.elements

fun main() {

    val employee1 = Employee("John", 2)
    println(employee1.toString())
    println(employee1.name)

    val change = 4.22
    println("Your change is $change")
    println("Your change is $$change")
    // printing variable name by escaping $ using \
    println("Your change is \$change")

    val numerator = 10.99
    val denominator = 20.00

    // expressions
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")
    println("The name of the employee is ${employee1.name}")


}

