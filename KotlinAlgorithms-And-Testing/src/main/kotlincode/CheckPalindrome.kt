package kotlincode

class CheckPalindrome {

    // Given the string, check if it is a palindrome.

    fun checkPalindrome(inputString: String): Boolean {
        val length: Int = inputString.length - 1
        val reversed: String = inputString.reversed()
        for (i in 0 until length) {
            if (reversed[i] != inputString[i]) {
                return false
            }
        }
        return true
    }

}