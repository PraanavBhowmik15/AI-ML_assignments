package question6

class HighOrderFunction {
  val maxTwoNumbers: (Int, Int) => Int = (x: Int, y: Int) => if (x > y) x else y
  def pickMaxInHigherOrderFunction(tuple: (Int, Int, Int), maxTwoNumbers: (Int, Int) => Int): Int = {
    maxTwoNumbers(tuple._1, maxTwoNumbers(tuple._2, tuple._3))
  }

}
