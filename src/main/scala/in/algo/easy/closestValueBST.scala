package in.algo.easy

import scala.io.StdIn.readLine

class BST(val value : Int, var left:BST = null, var right:BST = null)

object closestValueBST {
  private def findClosest(tree: BST, target: Int):Int={
    var closest = tree.value

    var currentNode = tree
    while currentNode != null do
      if Math.abs(target - currentNode.value) < Math.abs(target - closest) then
        closest = currentNode.value

      if target < currentNode.value then
        currentNode = currentNode.left
      else if target > currentNode.value then
        currentNode = currentNode.right
      else
        return closest

    closest
  }

  def main(args: Array[String]): Unit = {
    val tree = new BST(
      10,
      new BST(5, new BST(2, new BST(1, null, null), null), new BST(5, null, null)),
      new BST(15, new BST(13, null, new BST(14)), new BST(22, null, null))
    )

    val target = readLine("Enter the target: ").toInt
    val closestValue = findClosest(tree, target)
    println(closestValue)
  }
}
