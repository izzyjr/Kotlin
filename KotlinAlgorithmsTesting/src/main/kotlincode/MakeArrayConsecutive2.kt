package kotlincode

class MakeArrayConsecutive2 {

    fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
        var result: Int = 0
        val size: Int = statues.size
        statues.sort()
        for (i in 0 until size) {
            if (i < statues.size - 1) {
               result += (statues[i + 1] - statues[i]) - 1
            }
        }
        return result
    }

}