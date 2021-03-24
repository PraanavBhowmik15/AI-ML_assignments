import org.scalatest.flatspec.AnyFlatSpec
class GenericQueueTest extends AnyFlatSpec {
  "Queue" should "return only enqueued value as the list was empty initially" in{
    val queue = new GenericQueue[String](List())
    val enqueued = queue.enqueue("Hi").toString
    assertResult("List(Hi)")(enqueued)
  }

  it should "return enqueued list of int" in{
    val queue = new GenericQueue[Int](List(1,2))
    val result=queue.enqueue(3).toString
    assertResult("List(1, 2, 3)")(result)
  }
  it should "return dequeued list of int" in{
    val queue = new GenericQueue[Int](List(1,2))
    val enqueued = queue.enqueue(3)
    val dequeued=enqueued.dequeue.toString
    assertResult("Success(List(2, 3))")(dequeued)
  }
}