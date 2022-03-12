package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestMakeArrayConsecutive2 {

    private val algorithm: MakeArrayConsecutive2 = MakeArrayConsecutive2()

    @Test
    fun testMakeArrayConsecutive2() {
        val input: MutableList<Int> = mutableListOf(6, 2, 3, 8)
        val actualResult: Int = algorithm.makeArrayConsecutive2(input)
        Assert.assertEquals(actualResult, 3)
    }

    @Test
    fun testMakeArrayConsecutive21() {
        val input: MutableList<Int> = mutableListOf(4, 2, 7, 18)
        val actualResult: Int = algorithm.makeArrayConsecutive2(input)
        Assert.assertEquals(actualResult, 13)
    }


}