package kotlincode

class AdjacentElementsProduct {

    fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
        var largestProduct: Int = Int.MIN_VALUE
        var mul: Int = Int.MIN_VALUE
        val length: Int = inputArray.size
        for (i in 0 until length) {
            if (i < length - 1) {
                mul = inputArray[i] * inputArray[i + 1]
                if (mul > largestProduct) {
                    largestProduct = mul
                }
            }
        }
        return largestProduct
    }

}