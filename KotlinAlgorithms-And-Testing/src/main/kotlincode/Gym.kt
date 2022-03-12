package kotlincode

fun main() {

    val x = 25
    val y = 100
    val divide = x / y
    val modulo = x % y
    println(modulo)

    val pal = "eye"
    println(CheckPalindrome().checkPalindrome(pal))

    val array: MutableList<Int> = mutableListOf(1, 2, 3,4, 5)

    AdjacentElementsProduct().adjacentElementsProduct(array)

    // comparing unsorted collections

    val ar: Array<String> = arrayOf("true", "false", "Hello")
    val ar2: Array<String> = arrayOf("Hello", "false", "true")
    ar.sort()
    ar2.sort()
    println(ar.contentEquals(ar2))

    val list: List<String> = listOf("true", "false", "Hello")
    val list2: List<String> = listOf("Hello", "false", "true")
    println(list.containsAll(list2))
}