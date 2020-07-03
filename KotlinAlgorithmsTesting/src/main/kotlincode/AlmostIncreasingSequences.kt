package kotlincode

class AlmostIncreasingSequences {

    fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
        var count: Int = 0
        var total: Int = 2
        for (i in 0 until sequence.lastIndex) {
            var current: Int = sequence[i]
            var next: Int = sequence[i + 1]
            if (current >= next) {
                count++
                if (i > 0 && i != sequence.lastIndex - 1) {
                    var before: Int = sequence[i - 1]
                    if (before >= next) {
                        count++
                    }
                }
                if (count >= total) {
                    return false
                }
            }
        }
        return true
    }

}