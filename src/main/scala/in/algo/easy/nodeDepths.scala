package in.algo.easy

object nodeDepths {
  private def depth(node: BST):Int={
    sum(node, 0)
  }

  private def sum(node:BST, depth: Int):Int={
    if node == null then return 0

    val currentNodeDepth = depth
    val leftDepth = sum(node.left, depth+1)
    val rightDepth = sum(node.right, depth+1)

    currentNodeDepth + leftDepth + rightDepth
  }

  def main(args: Array[String]): Unit = {
    val tree = new BST(
      1,
      new BST(2,
        new BST(4,
          new BST(8, null, null),
          new BST(9, null, null)),
        new BST(5,
          null,
          null)),
      new BST(
        3,
        new BST(6, null, null),
        new BST(7, null, null)
      )
    )
    val result = depth(tree)
    println(result)
  }
}