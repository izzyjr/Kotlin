package kotlincode

import kotlincode.Calculator
import org.testng.Assert
import org.testng.annotations.Test

class TestCalculator {

    private val calculator: Calculator = Calculator()

    @Test
    fun testSum() {
        val calculation: Int = calculator.sum(7, 5)
        Assert.assertEquals(calculation, 12)
    }

    @Test
    fun testMultiply() {
        val calculation: Int = calculator.multiply(7, 5)
        Assert.assertEquals(calculation, 35)
    }

}