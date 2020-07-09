package kotlincode

class CommonCharacterCount {

    fun commonCharacterCount(s1: String, s2: String): Int {
        var count: Int = 0
        println(s2)

        iloop@for (i in s1.indices) {
            for (j in s2.indices) {
                if (s1[i] == s2[j]) {
                    count++

                    continue@iloop
                }
            }
        }
        return count
    }

}