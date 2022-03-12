package kotlincode

class ShapeArea {

    fun shapeArea(n: Int): Int {
        val evens: Int = (n * 2) - 2
        var result = (n * evens) + 1
        return result
    }

}