package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestIsLucky {

    private val algorithm: IsLucky = IsLucky()

    @Test
    fun testIsLucky() {
        val actualResult: Boolean = algorithm.isLucky(1230)
        Assert.assertEquals(actualResult, true)
    }

    @Test
    fun testIsLucky1() {
        val actualResult: Boolean = algorithm.isLucky(11)
        Assert.assertEquals(actualResult, true)
    }

}