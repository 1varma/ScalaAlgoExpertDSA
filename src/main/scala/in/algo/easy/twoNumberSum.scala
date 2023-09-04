package in.algo.easy

import scala.io.StdIn.readLine

object twoNumberSum {
  private def sum(arr: Array[Int], target: Int):Array[Int]={
    var temp:Array[Int] = Array.empty[Int]

    for i <- arr.indices do
      for j <- i+1 until arr.length do
        if arr(i) + arr(j) == target then
          temp = Array(arr(i), arr(j))
          return temp

    temp
  }

  def main(args: Array[String]): Unit = {
    val arr = readLine("Enter elements into array: ").split(" ").map(_.toInt)
    val target = readLine("Enter the target: ").toInt

    val result = sum(arr, target)
    println(result.mkString(", "))
  }
}
