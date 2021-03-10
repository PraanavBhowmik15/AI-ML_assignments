package LastElement

object LastElement {
  def main(args: Array[String]): Unit = {
    val a = new LastElementApi
    val output: Any = {
      a.lastElement(List(1, 2, "Apple", 4, "Mango"))
    }
    print(output)
  }
}
