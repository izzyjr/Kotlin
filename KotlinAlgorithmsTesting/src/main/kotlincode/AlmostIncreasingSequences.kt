package kotlincode

class AlmostIncreasingSequences {

    fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
        var count: Int = 0
        val max: Int = 2
        var standard: Int = Int.MIN_VALUE
        for (i in 0 until sequence.size - 1) {
            standard = sequence[i + 1]
            println("${sequence[i]} - ${sequence[i + 1]}")
            println("Standard: $standard")
            if (sequence[i] >= sequence[i + 1]) {
                if (sequence[i + 1] <= standard) {
                    count++
                }
                count++
                println(count)
                if (count == max) {
                    return false
                }
            }
        }
        return true
    }

}