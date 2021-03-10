package Queue

object QueueImpl {
  def main(args: Array[String]): Unit={
    val q = new Queue()
    q.enqueue(10)
    q.enqueue(20)
    q.dequeue()
    q.dequeue()
    q.enqueue(30)
    q.enqueue(40)
    q.enqueue(50)
    q.dequeue()
    println(q.list)
  }
}
