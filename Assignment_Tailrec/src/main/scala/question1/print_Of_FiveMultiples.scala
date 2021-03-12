//Author-Praanav
package question1
import scala.annotation.tailrec
class print_Of_FiveMultiples {
  @tailrec
  final def FiveMultiple(number : Int): Int={
    if(number > 50) number
    else {
      println(number)
      FiveMultiple(number + 5)
    }
  }

}
