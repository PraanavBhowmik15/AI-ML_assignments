package LastElement

class LastElementApi {

  def length(list: List[Any]): Int = list match {
    case Nil => 0
    case _ :: xs =>
      val count = length(xs)
      1 + count
  }
  def lastElement(list: List[Any]): Any ={
    val lengthOfList = length(list)
    val indexOfFinalElement = lengthOfList - 1
    val finalElement = list(indexOfFinalElement)
    finalElement
  }
}