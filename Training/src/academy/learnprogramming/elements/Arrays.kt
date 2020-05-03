package academy.learnprogramming.elements

import java.math.BigDecimal

fun main() {

    val employee1 = Employee("John", 11)
    val employee2 = Employee("Jane", 21)
    val employee3 = Employee("Jill", 31)
    val employee4 = Employee("Joe", 41)

    // String Array
    val names = arrayOf(employee1.name, employee2.name, employee3.name, employee4.name)
    println(names is Array<String>)
    println(names[3])

    // Int Array
    val ids = arrayOf(employee1.id, employee2.id, employee3.id, employee4.id)
    println(ids is Array<Int>)
    println(ids[1])

    // Object Array
    val employees = arrayOf(employee1, employee2, employee3, employee4)
    println(employees is Array<Employee>)
    println(employees[2])

    // long Array
    val longs = arrayOf<Long>(1, 2, 3, 5)
    println(longs is Array<Long>)
    println(longs[0])

    // lambda expression - initialize each element with even numbers zero through Thirty
    val evenNumbers = Array(16) {i -> i * 2}

    for (number in evenNumbers) {
        println(number)
    }

    // initialize each element with one through one hundred thousand
    val lotsOfNumber = Array(100000) {i -> i + 1}

    val employees2: Array<Employee>
    employees2 = arrayOf(employee1, employee2)
    for (employee in employees2) {
        println(employee.name)
    }

    var someArray = Array(5) {i -> (i + 1) * 10}
    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("Hello", 23, employee1.id, employee4, 'a', BigDecimal(10.2))
    for (rando in mixedArray) {
        println(rando)
    }

    println(mixedArray is Array<Any>)
    println(employee1.toString())
    println(employee1)

    //special primitive array int class
    var myIntArray = intArrayOf(1, 2, 3, 4, 5)
    for (num in myIntArray) {
        println(num)
    }

    // Converting Kotlin Int Class array to special primitive array int class
    ids.toIntArray()
    for (id in ids) {
        println(id)
    }

    var myIntArraye = IntArray(3)

    //converting to Kotlin int class
    myIntArray.toTypedArray()

    //special primitive array int class
    val myLongArray = longArrayOf(1, 2, 3, 4, 5)
    for (num in myLongArray) {
        println(num)
    }


}