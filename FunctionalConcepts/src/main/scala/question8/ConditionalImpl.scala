package question8

object ConditionalImpl {
  def main(args: Array[String]):Unit={
    val obj=new Conditional()
    val output=obj.conditional[String]("Hello", _.length > 4, _.reverse)
    print(output)
  }
}
