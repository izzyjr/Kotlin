package academy.learnprogramming.elements

fun main() {

    // create an array of int, of size five,
    // and all of the elements will be initialized to null
    val nullableInts = arrayOfNulls<Int?>(5)

    for (i in nullableInts) {
        println(i)
    }
    println(nullableInts[3].toString())


}