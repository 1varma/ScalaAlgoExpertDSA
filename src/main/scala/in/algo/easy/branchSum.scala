package in.algo.easy

import scala.collection.mutable

object branchSum {
  private def sum(root: BST):List[Int]={
    val arr = mutable.ListBuffer.empty[Int]
    calculateSum(root, 0, arr)
    arr.toList
  }

  private def calculateSum(node: BST, currentSum: Int, result: mutable.ListBuffer[Int]):Unit={
    if node == null then return 0

    val newSum = currentSum + node.value

    if node.left == null && node.right == null then
      result += newSum
    else
      calculateSum(node.left, newSum, result)
      calculateSum(node.right, newSum,result)
  }

  def main(args: Array[String]): Unit = {
    val tree = new BST(
      1,
      new BST(2,
        new BST(4,
          new BST(8, null, null),
          new BST(9, null, null)),
        new BST(5,
          new BST(10, null, null),
          null)),
      new BST(
        3,
        new BST(6, null, null),
        new BST(7, null, null)
      )
    )
    val result = sum(tree)
    println(result.mkString("[",", ","]"))
  }
}