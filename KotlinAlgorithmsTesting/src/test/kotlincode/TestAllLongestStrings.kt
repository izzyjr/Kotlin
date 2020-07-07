package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestAllLongestStrings {

    private val algorithm: AllLongestStrings = AllLongestStrings()

    @Test
    fun testAllLongestStrings() {
        val input: MutableList<String> = mutableListOf("aba", "aa", "ad", "vcd", "aba")
        val actualResult: MutableList<String> = algorithm.allLongestStrings(input)
        val expectedResult: MutableList<String> =  mutableListOf("aba", "vcd", "aba")
        Assert.assertEquals(actualResult == expectedResult, true)
    }

}