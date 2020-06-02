package academy.generics

import java.lang.StringBuilder

fun main() {

    val ints = listOf(1, 2, 3, 4, 5)

    val shorts: List<Short> = listOf(10, 20, 30, 40, 50)

    println(shorts is List)

    if (ints is List<Int>) {
        println("This list contains Ints")
    }

    restrictedPrintCollections(shorts)

    convertToInt(shorts)

    append(StringBuilder("String 1"), StringBuilder("String 2"))

    val list2: List<Any> = listOf(1, 23, 45, 64)
    println(list2 is List)
    if (list2 is List<Any>) {
        println("This list contains Any")
    }

    var listAny: List<Any> = listOf("str1", "str2")
    if (listAny is List) {
        println("wtf iz")
    }

    listAny = listOf(1, 2, 3, 4)
    if (listAny is List) {
        println("This list contains strings")
        val strList = listAny as List<String>
        println(strList[0].replace("str1", "String"))
    }

}

fun <T: Any> restrictedPrintCollections(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

fun <T> append(item1: T, item2: T)
    where T: CharSequence, T: Appendable {
    println("Result is ${item1.append(item2)}")
}

fun <T: Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println(num?.toInt())
    }
}