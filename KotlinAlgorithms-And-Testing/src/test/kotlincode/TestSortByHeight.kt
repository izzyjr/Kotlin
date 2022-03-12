package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestSortByHeight {

    private val algorithm: SortByHeight = SortByHeight()

    @Test
    fun testSortByHeight() {
        val input: MutableList<Int> = mutableListOf(-1, 150, 190, 170, -1, -1, 160, 180)
        val expectedResult: MutableList<Int> = mutableListOf(-1, 150, 160, 170, -1, -1, 180, 190)
        val actualResult: MutableList<Int> = algorithm.sortByHeight(input)
        Assert.assertEquals(actualResult, expectedResult)
    }


}