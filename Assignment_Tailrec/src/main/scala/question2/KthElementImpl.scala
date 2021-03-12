package question2

object KthElementImpl {
  def main(args: Array[String]): Unit={
    val obj= new KthElement()
    val k=obj.findElement(List(1,2,3,4,5),0,2)
    println(k)
  }

}
