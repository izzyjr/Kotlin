package kotlincode

class CommonCharacterCount {

    fun commonCharacterCount(s1: String, s2: String): Int {
        var count = 0
        var s3 = s2.toCharArray()
        iloop@for (i in s1.indices) {
            for (j in s3.indices) {
                if (s1[i] == s3[j]) {
                    count++
                    s3[j] = '*'
                    continue@iloop
                }
            }
        }
        return count
    }

}