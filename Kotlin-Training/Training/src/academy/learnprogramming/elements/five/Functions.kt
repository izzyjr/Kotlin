package academy.learnprogramming.elements.five

fun main() {

    println(labelMultiply(3, 4))
    println(labelMultiply(label = "out of order", operand2 = 4, operand = 3))

    val emp1 = Employee2("Jayson")
    println(emp1.upperCaseFirstName())

    val car1 = Car2("Blue", "Toyota", 1999)
    val car2 = Car2("Red", "Renault", 2020)
    val car3 = Car2("Green", "Ferrari", 1990)

    printColors(car1, car2, car3, message = "Something Extra")

    val manyCars = arrayOf(car1, car2, car3)
    printColors2(*manyCars)
    val moreCars = arrayOf(car2, car3)
    val car4 = car1.copy()
    println("*****************************")

    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    for (c in lotsOfCars) {
        println(c)
    }

    val utils = Utils()
    val name = utils.upperCaseFirstLast("Marcelo")
    println(name)

    val name2 = "Maria"
    println(name2.upperCaseFirstLast())


}

fun String.upperCaseFirstLast(): String {
    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

fun printColors2(vararg  cars: Car2) {
    for (car in cars) {
        println(car.color)
    }
}

fun printColors(vararg  cars: Car2, message: String) {
    for (car in cars) {
        println(car.color)
    }
    println(message)
}

fun labelMultiply(operand: Int, operand2: Int, label: String = "The answer is:"): String =
    "$label ${operand * operand2}"

data class Car2(val color: String, val model: String, val year: Int) {

}

class Employee2(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase()

}