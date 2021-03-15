//Author-Praanav Bhowmik
package OOPs_assignment1.TraitQ

trait traitQueue {

  var list: List[Int] = List[Int]()
  var firstIndex: Int = -1
  var lastIndex: Int = -1

  //enqueue method to add element at last index in the Queue
  def enqueue(element: Int): Unit = {
    if (firstIndex == -1 && lastIndex == -1) { // Check if it is the first element
      firstIndex += 1
      list = list :+ element
    }
    else {
      list = list :+ element
    }
    lastIndex += 1
  }

  //dequeue method to delete the first element of the queue
  def dequeue(): Unit = {
    require(firstIndex != -1 && lastIndex != -1, "Queue UnderFlow !!!") // Check for queue underflow !!
    if (lastIndex == firstIndex) { // Removing the last element from the queue
      list = list.drop(1)
      lastIndex = -1
      firstIndex = -1
    }
    else {
      list = list.drop(1)
      firstIndex = firstIndex + 1
    }
  }

  // egtQueue method to Display the elements of Queue as List
  def getQueue: List[Int] = {
    list
  }
}
