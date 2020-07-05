package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestMatrixElementsSum {

    val algorithm: MatrixElementsSum = MatrixElementsSum()

    @Test
    fun testMatrixElementsSum() {
        val input: MutableList<MutableList<Int>> = mutableListOf(mutableListOf(0,1,1,2),
                mutableListOf(0,5,0,0), mutableListOf(2,0,3,3))
        val actualResult: Int = algorithm.matrixElementsSum(input)
        Assert.assertEquals(actualResult, 9)
    }

}