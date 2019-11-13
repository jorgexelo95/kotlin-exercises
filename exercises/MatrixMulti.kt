package exercises

fun main (arg: Array<String>){
    var matrix1 = arrayOf(intArrayOf(0,1,2), intArrayOf(3,4,5))
    var matrix2 = arrayOf(intArrayOf(6,7), intArrayOf(8,9), intArrayOf(10,11))
    val rowOfMatrix1 = 2
    val colOfMatrix1 = 3
    val rowOfMatrix2 = 3
    val colOfMatrix2 = 2
    var result = multiMatrix(matrix1, matrix2, rowOfMatrix1, colOfMatrix1, colOfMatrix2)
    display(result)


}

fun display(temp: Array<IntArray>){
    println("The product of the matrixes is: ")
    for(i in temp){
        for(j in temp){
            print("$j  ")
        }
    }
    println()
}

fun multiMatrix(first: Array<IntArray>, second: Array<IntArray>, row: Int, col1: Int, col2: Int): Array<IntArray>{
    var result = Array(row) { IntArray(col2) }
    for (i in 0..row - 1) {
        for (j in 0..col2 - 1) {
            for (k in 0..col1 - 1) {
                result[i][j] += first[i][k] * second[k][j]
            }
        }
    }
    return result
}

