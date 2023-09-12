package in.algo.easy

object evaluateExprTree {
  private def depth(node: BST): Int = {
    evaluate(node)
  }

  private def evaluate(node: BST): Int = {
    if node == null then return 0

    node.value match
      case -1 => evaluate(node.left) + evaluate(node.right)
      case -2 => evaluate(node.left) - evaluate(node.right)
      case -3 => evaluate(node.left) / evaluate(node.right)
      case -4 => evaluate(node.left) * evaluate(node.right)
      case _ => node.value
  }

  def main(args: Array[String]): Unit = {
    val tree = new BST(
      -1,
      new BST(-2,
        new BST(-4,
          new BST(2, null, null),
          new BST(3, null, null)),
        new BST(2,
          null,
          null)),
      new BST(
        -3,
        new BST(8, null, null),
        new BST(3, null, null)
      )
    )
    val result = depth(tree)
    println(result)
  }

}
