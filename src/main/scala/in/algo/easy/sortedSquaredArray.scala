package in.algo.easy

import scala.io.StdIn.readLine
object sortedSquaredArray {
  private def transform(arr: Array[Int]):Array[Int]={
    for i <- arr.indices do
      arr(i) = arr(i) * arr(i)

    arr.sorted
  }

  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter elements into array: ").split(' ').map(_.toInt).sorted

    println(s"${transform(arr).mkString(", ")}")
  }
}
