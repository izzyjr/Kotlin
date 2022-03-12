package academy.sequences

import academy.learnprogramming.collections.Car

fun main() {

    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            17 to Car("green", "Ford", 2010),
            8 to Car("red", "BMW", 2009))

    val fords: List<Int> = immutableMap.filter { it.value.model == "Ford" }
        .map { it.value.year }
    println(fords.javaClass)

    val fordSequence = immutableMap.asSequence().filter { it.value.model == "Ford" }
        .map { it.value.year }
    println(fordSequence.javaClass)

    val nameList = listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("Filtering $it"); it[0] == 'J' }
        .map { println("Mapping $it"); it.toUpperCase()}
        .toList()
    println(nameList)
    println(nameList.javaClass)

    val firstNameE = listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("Filtering $it"); it[0] == 'J' }
        .map { println("Mapping $it"); it.toUpperCase()}
        .find { it.endsWith('E') }
    println(firstNameE)
    println(firstNameE is String)

    val firstNameECollection = listOf("Joe", "Mary", "Jane")
        .map { println("Mapping $it"); it.toUpperCase()}
        .filter { println("Filtering $it"); it[0] == 'J' }
        .find { it.endsWith('E') }
    println(nameList)
    println(nameList.javaClass)


}