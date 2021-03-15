//Author-Praanav Bhowmik
package OOPs_assignment1.QueueImpl

import OOPs_assignment1.{DoubleQueue, SquareQueue}

object Queue_Impl {
  def main(args: Array[String]): Unit = {
    val doubleQueue = new DoubleQueue
    val squareQueue = new SquareQueue

    // Checking the Double Queue Implementation
    println("Double Queue ")
    println("Queue before enqueue : " + doubleQueue.getQueue)
    doubleQueue.enqueue(2)
    doubleQueue.enqueue(4)
    println("Queue before dequeue : " + doubleQueue.getQueue)
    doubleQueue.dequeue()
    println("Final Queue " + doubleQueue.getQueue)

    // Verifying the Square Queue Implementation
    println("\nSquare Queue ")
    println("Queue before enqueue : " + squareQueue.getQueue)
    squareQueue.enqueue(1)
    squareQueue.enqueue(3)
    println("Queue before dequeue : " + squareQueue.getQueue)
    squareQueue.dequeue()
    squareQueue.dequeue()
    println("Final Queue " + squareQueue.getQueue)
  }
}
