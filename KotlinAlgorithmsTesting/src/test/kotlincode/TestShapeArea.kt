package kotlincode

import org.testng.Assert
import org.testng.annotations.Test

class TestShapeArea {

    private val algorithm: ShapeArea = ShapeArea()

    @Test
    fun testShapeArea() {
        val input: Int = 3
        val actualResult: Int = algorithm.shapeArea(input)
        Assert.assertEquals(actualResult, 13)
    }

    @Test
    fun testShapeArea1() {
        val input: Int = 5
        val actualResult: Int = algorithm.shapeArea(input)
        Assert.assertEquals(actualResult, 41)
    }

    @Test
    fun testShapeArea2() {
        val input: Int = 9999
        val actualResult: Int = algorithm.shapeArea(input)
        Assert.assertEquals(actualResult, 199940005)
    }

}