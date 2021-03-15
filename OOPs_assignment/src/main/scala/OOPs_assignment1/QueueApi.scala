//Author-Praanav Bhowmik
package OOPs_assignment1

import OOPs_assignment1.TraitQ.traitQueue

class DoubleQueue extends traitQueue {
    // Overriding the enqueue method to add double of element to the queue
    override def enqueue(element: Int): Unit = {
      if (firstIndex == -1 && lastIndex == -1) {
        firstIndex += 1
        list = list :+ (2 * element)
      }
      else {
        list = list :+ (2 * element)
      }
      lastIndex += 1
    }
  }
class SquareQueue extends traitQueue {
  //Overriding the enqueue method to add the square of the element in the queue
  override def enqueue(element: Int): Unit = {
    if (firstIndex == -1 && lastIndex == -1){
      firstIndex += 1
      list = list :+ (element*element)
    }
    else{
      list = list :+ (element*element)
    }
    lastIndex += 1
  }

}