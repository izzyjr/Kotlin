package kotlincode

class SortByHeight {

    fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
        var empty: Int = 0
        for (i in 0 until a.lastIndex) {
            for (j in 0 until a.lastIndex) {
                if (j + 1 < a.lastIndex) {
                    if (a[j] > a[j + 1]) {
                        println("a[j] = ${a[j]}")
                        empty = a[j]
                        a[j] = a[j + 1]
                        a[j + 1] = empty
                        println("a[j] = ${a[j]}")
                    }
                }
            }
        }
        for (num in a) {
            print("$num, ")
        }
        return a
    }

}