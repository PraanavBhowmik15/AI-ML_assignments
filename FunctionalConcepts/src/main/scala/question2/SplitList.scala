package question2

import scala.annotation.tailrec

class SplitList {
  def splitList[A](splitValue: Int, inputList: List[A]):(List[A], List[A]) = {
    @tailrec
    def split[A](count: Int, resultList: List[A], remainingList: List[A]):(List[A],List[A]) = (count, remainingList) match {
      case (_, Nil) => (resultList, Nil)
      case (0, remainingList) => (resultList, remainingList)
      case (count, head::tail) => split(count - 1, resultList:::List(head), tail)
    }
    split(splitValue, List(), inputList)
  }
}
