package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestAdjacentElementsProduct {

    val algorithm: AdjacentElementsProduct = AdjacentElementsProduct()

    @Test
    fun testAdjacentElementsProduct() {
        val input: MutableList<Int> = mutableListOf(3, 6, -2, -5, 7, 3)
        val actualResult: Int = algorithm.adjacentElementsProduct(input)
        Assert.assertEquals(actualResult, 21)
    }

    @Test
    fun testAdjacentElementsProduct1() {
        val input: MutableList<Int> = mutableListOf(4, 1, 2, 3, 1, 5)
        val actualResult: Int = algorithm.adjacentElementsProduct(input)
        Assert.assertEquals(actualResult, 6)
    }

    @Test
    fun testAdjacentElementsProduct2() {
        val input: MutableList<Int> = mutableListOf(1, 0, 1, 0, 1000)
        val actualResult: Int = algorithm.adjacentElementsProduct(input)
        Assert.assertEquals(actualResult, 0)
    }

}