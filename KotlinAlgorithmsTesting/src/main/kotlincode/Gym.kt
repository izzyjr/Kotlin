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

}