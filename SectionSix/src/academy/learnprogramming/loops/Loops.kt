package academy.learnprogramming.loops

fun main() {

    // Is the number greater than or equal to the start value?
    // Is the number less than or equal to the end value?
    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCCCCC" in stringRange)

    val str = "Hello"
    for (c in str) {
        println(c)
    }

    // backward ranges
    val backwardRange = 5.downTo(1)
    println(2 in backwardRange)

    // step determined ranges
    val stepRange = 3..15
    val stepThree = stepRange.step(3).reversed()
    val reversedRange = stepRange.reversed()
    for (i in stepRange) {
        println(i)
    }

    for (num in 1..20 step 4) {
        println(num)
    }

    for (i in 20 downTo 15) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    val s = "goodbye"
    val sRange = 0..s.length

    val seasons = arrayOf("Spring", "Summer", "Fall", "Winter")
    for (season in seasons) {
        println(season)
    }

    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed {index, value -> println("$value is season number $index")}

    val notASeason = "whatever" !in seasons
    println(notASeason)

    val notInRange = 32 !in 1..10
    println(notInRange)

    println("****************************")

    val str1 = "Hello"
    println('e' in str)
    println('e' !in str)

}