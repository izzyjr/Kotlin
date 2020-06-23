package kotlincode

class AdjacentElementsProduct {

    fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
        var largestProduct: Int = 0
        var mul: Int = 0
        var myArray: MutableList<Int> = mutableListOf()
        val length: Int = inputArray.size
        for (i in 0 until length) {
            if (i < length - 1) {
                mul = inputArray[i] * inputArray[i+1]
                if (mul > largestProduct) {
                    myArray.add(mul)
                } else {
                    myArray.add(largestProduct)
                }
                mul = 0
            }
        }
        for (num in myArray) {
            if (num > largestProduct) {
                largestProduct = num
            }
        }
        return largestProduct
    }

}