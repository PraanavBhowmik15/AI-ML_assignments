package question6

object HigherOrderFunctionImpl {
  def main(args: Array[String]):Unit={
    val obj=new HighOrderFunction()
    val maxInTuple=obj.pickMaxInHigherOrderFunction((3,5,4),obj.maxTwoNumbers)
    print(maxInTuple)
  }

}
