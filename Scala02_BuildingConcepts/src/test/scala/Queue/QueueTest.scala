package Queue
import org.scalatest.flatspec.AnyFlatSpec
class QueueTest extends AnyFlatSpec {
  "The Queue" should "is correct" in {
    val q = new Queue()
    q.enqueue(10)
    q.enqueue(20)
    q.dequeue()
    q.dequeue()
    q.enqueue(30)
    q.enqueue(40)
    q.enqueue(50)
    q.dequeue()
    val expectedResult=List(40, 50)
    val actualResult=q.list
    assert(actualResult===expectedResult)
  }
}
