//Author-Praanav Bhowmik
package OOps_assignment1
import OOPs_assignment1.{DoubleQueue, SquareQueue}
import org.scalatest.flatspec.AnyFlatSpec
class QueueTest extends AnyFlatSpec {
  "The Double implementation" should "is correct" in{
    val expectedResult=List(4, 8)
    val obj=new DoubleQueue()
    obj.enqueue(2)
    obj.enqueue(4)
    val actualResult=obj.getQueue
    assert(expectedResult===actualResult)
  }
  "The Square implementation" should "is correct" in{
    val expectedResult=List(4, 9)
    val obj=new SquareQueue()
    obj.enqueue(2)
    obj.enqueue(3)
    val actualResult=obj.getQueue
    assert(expectedResult===actualResult)
  }
}
