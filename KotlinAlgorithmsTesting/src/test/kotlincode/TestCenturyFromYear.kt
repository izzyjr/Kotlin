package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestCenturyFromYear {

    private val algorith: CenturyFromYear = CenturyFromYear()

    @Test
    fun testCenturyFromYear() {
        val result = algorith.centuryFromYear(2)
        Assert.assertEquals(result, 1)
    }

    @Test
    fun testCenturyFromYear1() {
        val result = algorith.centuryFromYear(2006)
        Assert.assertEquals(result, 21)
    }

}