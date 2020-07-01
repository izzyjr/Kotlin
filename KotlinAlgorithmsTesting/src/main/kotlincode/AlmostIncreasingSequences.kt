package kotlincode

class AlmostIncreasingSequences {

    fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
        var count: Int = 0
        var total: Int = 2
        var max: Int = sequence[0]
        var min: Int = sequence[0]
        for (i in 0 until sequence.size - 1) {
            var current: Int = sequence[i]
            var next: Int = sequence[i + 1]
            if (current >= next) {
                count++
                if (min <= next) {
                    count++
                } else if (min >= next) {
                    min = next
                }
                if (count >= total) {
                    return false
                }
            } else {
                if (max >= next) {
                    count++
                } else if (max <= next) {
                    max = next
                }
                if (count >= total) {
                    return false
                }
            }
        }
        println(count)
        return true
    }

}