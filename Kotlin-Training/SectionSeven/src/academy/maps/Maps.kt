package academy.maps

fun main() {

    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("Silver", "Honda", 2013)
    )
    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = mutableMapOf<String, Car>(
        "John's car" to Car("red", "Range Rover", 2010),
        "Jane's car" to Car("blu", "Mazda", 2009)
    )
    println(mutableMap.javaClass)
    println(mutableMap)

    val hashmap = hashMapOf<Int, Car>(
        1 to Car("red", "Ferrari", 1980),
        2 to Car("blu", "Mitsubishi", 2020)
    )
    println(hashmap.javaClass)
    println(hashmap)
    hashmap.put(3, Car("purple", "Honda", 1990))
    println(hashmap.get(3).toString())

    for (entry in hashmap) {
        println(entry.key)
        println(entry.value)
    }

    for ((key, value) in hashmap) {
        println(key)
        println(value)
    }

    val car = Car("Orange", "Ford", 2019)
    val (color, model, year) = car

    println(color)

    val pair = Pair(12, "Twelve")
//    val firstValue = pair.first
//    val secondValue = pair.second
    val (firstValue, secondValue) = pair
    println("$firstValue and $secondValue")



}

class Car(val color: String, val model: String, val year: Int) {

    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year

    override fun toString(): String {
        return "Car(color='$color', model='$model', year=$year)"
    }
}