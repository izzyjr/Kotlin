package kotlincode

class SortByHeight {

    fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
        var empty: Int = 0
        for (i in 0 until a.lastIndex) {
            for (j in 0 until a.lastIndex) {
                if (j + 1 < a.lastIndex) {
                    if (a[j] != -1) {
                        if (a[j + 1] == -1 && a[j + 1] != a.lastIndex) {
                            if (a[j] > a[j + 2]) {
                                println("a[j] = ${a[j]}")
                                empty = a[j]
                                a[j] = a[j + 2]
                                a[j + 2] = empty
                                println("a[j] = ${a[j]}")
                            }
                        } else  {
                            if (a[j] > a[j + 2]) {
                                println("a[j] = ${a[j]}")
                                empty = a[j]
                                a[j] = a[j + 2]
                                a[j + 2] = empty
                                println("a[j] = ${a[j]}")
                            }
                        }
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