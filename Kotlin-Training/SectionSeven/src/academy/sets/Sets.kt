package academy.sets

fun main() {

    val mutableInts = mutableSetOf(1, 2, 3, 4, 5)
    println("plus 27: " + mutableInts.plus(27))
    println("minus 3: " + mutableInts.minus(3))
    println("Original state $mutableInts")
    println("Average: ${mutableInts.average()}")
    println("Dropping first 2:  ${mutableInts.drop(2)}")
    println("Adding 34: ${mutableInts.add(34)}")
    println("Original state $mutableInts")

    // no duplicate values
    val immutableInts = setOf(11, 12, 14, 15)
    println(immutableInts.plus(30))
    println(immutableInts.minus(11))


}