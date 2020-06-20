package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestCheckPalindrome {

    private val algorithm: CheckPalindrome = CheckPalindrome()

    @Test
    fun testCheckPalindrome() {
        val result: Boolean = algorithm.checkPalindrome("hlbeeykoqqqokyeeblh")
        Assert.assertEquals(result, true)
    }

    @Test
    fun testCheckPalindrome1() {
        val result: Boolean = algorithm.checkPalindrome("az")
        Assert.assertEquals(result, false)
    }

}