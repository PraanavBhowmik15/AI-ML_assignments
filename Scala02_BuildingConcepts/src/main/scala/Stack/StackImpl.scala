package Stack

object StackImpl {
  def main(args: Array[String]): Unit = {
    val ob = new Stack()
    ob.push(25)
    ob.push(65)
    ob.push(11)
    ob.push(22)
    ob.push(33)
    ob.push(44)

    // print Stack elements
    ob.display()

    // print Top element of Stack
    println("\nTop element is =" + ob.peek())

    // Delete top element of Stack
    ob.pop()
    ob.pop()

    // print Stack elements
    ob.display()

    // print Top element of Stack
    println("\nTop element is =" + ob.peek())

  }
}
