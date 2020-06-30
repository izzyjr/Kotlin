package kotlincode

class AlmostIncreasingSequences {

    fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
        var count: Int = 0
        var total: Int = 2
        var max: Int? = sequence.max()
        println(max)
        var min: Int? = sequence.min()
        println(min)
        for (i in 0 until sequence.size - 1) {
            if (sequence[i] >= sequence[i + 1]) {
                if (sequence[i + 1] <= min!!) {
                    count++
                }
                count++
                if (count == total) {
                    return false
                }
            }
        }
        return true
    }

}