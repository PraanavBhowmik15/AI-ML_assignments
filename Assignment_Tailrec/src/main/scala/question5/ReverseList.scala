//Author-Praanav
package question5
import scala.annotation.tailrec

class ReverseList {
  def reverseList[A](list: List[A]): List[A] = {
    @tailrec
    def reverseRecursive(resultList: List[A], currentList: List[A]): List[A] = currentList match {
      case Nil => resultList
      case topValueOfList :: listWithoutTopValue => reverseRecursive(topValueOfList :: resultList, listWithoutTopValue)
    }
    reverseRecursive(Nil, list)
  }
}
