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

    val house1 = House("blue", "Mansion", 100)
    println(house1)
    val house2 = House("green", "apartment", 50)
    println(house2)
    val house3 = house2.copy(color = "purple" ,price = 70)
    println("This is house3 = $house3")
    house2.color = "blue"
    house2.type = "Mansion"
    house2.price = 100
    println(house2.toString())
    println(house1 == house2)
    println(house1 === house2)
    println(house1.equals(house2))

    println(house3.hashCode())


}

data class House(var color: String, var type: String, var price: Int) {

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