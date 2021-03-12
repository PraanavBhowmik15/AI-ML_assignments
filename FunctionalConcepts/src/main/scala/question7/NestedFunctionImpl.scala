package question7

object NestedFunctionImpl {
  def main(args: Array[String]):Unit={
    val obj=new NestedFunction()
    val outputFunction=obj.productOfTwoNumbers(7)
    val product= outputFunction(3)
    print(product)
  }
}
