package in.algo.easy

import scala.io.StdIn.readLine

object validSubsequence {
  private def valid(array: Array[Int], sequence: Array[Int]): Boolean = {
    var arrIdx = 0
    var seqIdx = 0

    while (arrIdx < array.length && seqIdx < sequence.length) {
      if (array(arrIdx) == sequence(seqIdx)) {
        seqIdx += 1
      }
      arrIdx += 1
    }

    seqIdx == sequence.length
  }
  def main(args: Array[String]): Unit = {
    val array = readLine("Enter the elements into array1: ").split(" ").map(_.toInt)
    val sequence = readLine("Enter the elements into array2: ").split(" ").map(_.toInt)

    valid(array, sequence) match
      case true => println("true")
      case _ => println("false")
  }
}
