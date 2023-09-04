package in.algo.easy

import scala.io.StdIn.readLine

object nonConstructibleChange {
  private def transform(coins:Array[Int]):Int={
    val sortedCoins = coins.sorted
    var minSum = 0

    for coin <- sortedCoins do
      if coin > minSum+1 then
        return minSum+1

      minSum += coin

    minSum+1
  }

  def main(args: Array[String]): Unit = {
    val coins = readLine("Enter the change into array: ").split(" ").map(_.toInt)

    println(s"${transform(coins)}")
  }
}
