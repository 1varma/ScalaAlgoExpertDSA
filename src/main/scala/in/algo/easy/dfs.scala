package in.algo.easy

import scala.collection.mutable.ArrayBuffer

class Tree(val value : String, var first:Tree = null, var second:Tree = null, var third:Tree = null)

object dfs {

  private def dfs(tree: Tree, arr: ArrayBuffer[String]): Unit = {
    if (tree == null) {
      return
    }

    arr += tree.value // Add the current node's value to the array

    // Recursively traverse the child nodes
    dfs(tree.first, arr)
    dfs(tree.second, arr)
    dfs(tree.third, arr)
  }

  def main(args: Array[String]): Unit = {
    val tree = new Tree(
      "A",
      new Tree("B",
        new Tree("E", null, null, null),
        new Tree("F",
          new Tree("I", null, null, null),
          new Tree("J", null, null, null),
          null
        ),
        null
      ),
      new Tree("C", null, null, null),
      new Tree("D",
        new Tree("G",null, null,
          new Tree("K", null, null)
        ),
        new Tree("H", null, null, null)
      )
    )
    val arr = ArrayBuffer.empty[String]
    dfs(tree,arr)

    // Print the result or use it as needed
    println(s"${arr.mkString(", ")}")
  }
}
