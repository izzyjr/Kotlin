package academy.challenge7

fun main() {

    val joe = Person("Joe", "Jones", 45)
    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    val jane = Person("Jane", "Smith", 23)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 60)
    val immutablePersonMap: Map<String, Person> = mapOf(joe.lastName to joe, jane.lastName to jane,
            mary.lastName to mary, john.lastName to john, jean.lastName to jean)

    immutablePersonMap.filter { it.value.lastName[0] == 'S' }
        .map { println(it.value.lastName) }
    println(immutablePersonMap.filter { it.value.lastName.startsWith('S')}.count())

    val listPairNames: MutableList<Pair<String, String>> = mutableListOf()
    immutablePersonMap.map { listPairNames.add(Pair(it.value.firstName, it.value.lastName)) }
    println(listPairNames)

    val namePairs = immutablePersonMap.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    immutablePersonMap.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)

    val list3 = list1.filter { it in list2 }
    println(list3)

    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper

}

class Box<out T> {

}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}

class Person(val firstName: String, val lastName: String, val age: Int) {

    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age

}