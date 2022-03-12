package kotlincode

class MatrixElementsSum {

    fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
        var count: Int = 0
        var numRows: Int = matrix.size
        var numColumns: Int = matrix[0].size

        for (i in 0 until numRows) {
            for (j in 0 until numColumns) {
                if (i == 0) {
                    count += matrix[i][j]
                    if (matrix[i][j] == 0) {
                        if (i < numRows - 1) {
                            matrix[i + 1][j] = 0
                        }
                    }
                } else if (matrix[i][j] == 0) {
                    if (i < numRows - 1) {
                        matrix[i + 1][j] = 0
                    }
                    count += matrix[i][j]
                } else {
                    count += matrix[i][j]
                }
            }
        }
        return count
    }

}