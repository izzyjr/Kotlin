package academy.generics

import java.math.BigDecimal

fun main() {

    val mixedList: List<Any> = listOf("String", 1, BigDecimal(2.3), "Fall", BigDecimal(1.2))
    val bigDecimalsOnly = getElementsOfTYpe<String>(mixedList)
    for (num in bigDecimalsOnly) {
        println(num)
    }

}

inline fun <reified T> getElementsOfTYpe(list: List<Any>): List<T> {

    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }
    return newList
}