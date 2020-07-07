package kotlincode

class AllLongestStrings {

    fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
        var maxLength: Int = 0
        for (str in inputArray) {
            if (maxLength <= str.length) {
                maxLength = str.length
            }
        }

        println(maxLength)

        return inputArray
    }

}