//Author-Praanav
package question4

import scala.annotation.tailrec

class SlicingList {
  def slice[A](start: Int, end: Int, inputList: List[A]): List[A] = {
    @tailrec
    def sliceRecursive(count: Int, currentList: List[A], result: List[A]): List[A] = {
      if (currentList.isEmpty || count >= end) {
        result.reverse
      }
      else {
        sliceRecursive(count + 1, currentList.tail, if (count >= start){currentList.head :: result} else result)
      }
    }
    sliceRecursive(count= 0, inputList, Nil)
  }

}
