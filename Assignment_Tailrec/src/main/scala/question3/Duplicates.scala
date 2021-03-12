//Author-Praanav
package question3

import scala.annotation.tailrec

class Duplicates {
  def removeDuplicate[Any](inputList : List[Any]) : List[Any] = {
    @tailrec
    def removeDuplicateRecursive(inputListByUser: List[Any], accumulatorList: List[Any]) : List[Any] = inputListByUser match {
      case Nil => accumulatorList.reverse
      case topValueOfList :: listWithoutTopValue =>
        if (accumulatorList.contains(topValueOfList)) {
          removeDuplicateRecursive (listWithoutTopValue, accumulatorList)
        } else {
          removeDuplicateRecursive(listWithoutTopValue, topValueOfList :: accumulatorList)
        }
    }
    removeDuplicateRecursive(inputList, Nil)
  }

}
