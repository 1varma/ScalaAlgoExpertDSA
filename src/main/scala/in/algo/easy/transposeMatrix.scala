package in.algo.easy

object transposeMatrix {
  private def transposeMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    if (matrix.isEmpty) {
      return Array.empty[Array[Int]] // Return an empty array if the input matrix is empty
    }

    val numRows = matrix.length
    val numCols = matrix(0).length

    val transposed = Array.ofDim[Int](numCols, numRows)

    for i <- 0 until numRows do
      for j <- 0 until numCols do
        transposed(j)(i) = matrix(i)(j)

    transposed
  }

  def main(args: Array[String]): Unit = {
    val matrix = Array(
      Array(1, 2, 3),
      Array(4, 5, 6)
    )

    val transposedMatrix = transposeMatrix(matrix)
    for (row <- transposedMatrix) {
      println(row.mkString(" ")) // Print the transposed matrix
    }
  }
}