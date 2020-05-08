package academy.learnprogramming.elements.five

val MY_CONSTANT = 100

fun main() {

    println(MY_CONSTANT)

    val emp = Employee("John")
    println(emp)

    val emp2 = Employee("John")
    println(emp2)

    emp2.fullTime = true
    println(emp2.fullTime)

    println("Hello: ${emp.equals(emp2)}")

    val car = Car("Red", "Ferrari", 1982)
    println(car)

    val car2 = Car("Blue", "Ferrari", 1982)
    println("Hello2: ${car == car2}")

    val car3 = car.copy()
    println(car3)

    val car4 = car.copy("Green", "Renault")
    println(car4)

}

data class Car(val color: String, val model: String, val year: Int) {

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