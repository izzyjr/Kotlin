package kotlincode

class AlmostIncreasingSequences {

    fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
        var count: Int = 0
        val max: Int = 2
        for (i in 0 until sequence.size - 1) {
            if (sequence[i] >= sequence[i + 1]) {
                println(count)
                count++
                if (count == max) {
                    return false
                }
            }
        }
        println(count)
        return true
    }

}