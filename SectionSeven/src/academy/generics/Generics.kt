package academy.generics

import academy.learnprogramming.collections.Car
import java.math.BigDecimal

fun main() {

    val list: MutableList<String> = mutableListOf("Hello")
    list.add("another string")
    list[0].toUpperCase()
    println(list)
    printCollections(list)

    val bdList: MutableList<BigDecimal> = mutableListOf(BigDecimal(-33.45), BigDecimal(34.567),
                BigDecimal(54.3456))

    printCollections(bdList)
    list.extensionPrintCollections()

}

fun <T> List<T>.extensionPrintCollections() {
    for (item in this) {
        println(item)
    }
}

fun <T> printCollections(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}