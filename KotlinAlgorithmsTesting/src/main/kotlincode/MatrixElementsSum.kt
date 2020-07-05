package kotlincode

class MatrixElementsSum {

    fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
        var result: Int = 0

        for (i in 0 until matrix.lastIndex) {
            for (j in 0 until matrix[i].lastIndex) {
                println(matrix[i][j])
            }
        }


        return result
    }

}