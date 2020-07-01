package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestAlmostIncreasingSequences {

    val algorithm: AlmostIncreasingSequences = AlmostIncreasingSequences()

    @Test
    fun testAlmostIncreasingSequences() {
        val input: MutableList<Int> = mutableListOf(1, 3, 2, 1)
        val actualResult: Boolean = algorithm.almostIncreasingSequence(input)
        Assert.assertEquals(actualResult, false)
    }

    @Test
    fun testAlmostIncreasingSequences1() {
        val input: MutableList<Int> = mutableListOf(1, 3, 2, 1)
        val actualResult: Boolean = algorithm.almostIncreasingSequence(input)
        Assert.assertEquals(actualResult, false)
    }

}