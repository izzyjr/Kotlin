package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestSum {

    private val algorithm: Add = Add()

    @Test
    fun testAdd1() {
        val result = algorithm.add(3, 11)
        Assert.assertEquals(result, 14)
    }

}