//Author-Praanav
package question2
import scala.annotation.tailrec

class KthElement {
  @tailrec
  final def findElement(list : List[Int], index:Int, Kth : Int) : Int={
    if(Kth == index) list(index)
    else findElement(list,index+1, Kth)
  }
}
