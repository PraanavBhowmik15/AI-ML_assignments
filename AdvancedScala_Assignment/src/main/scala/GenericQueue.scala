import scala.util.Try
class GenericQueue[+A](list:List[A]) {
  override def toString: String = list.toString
  def enqueue[B>:A](input:B):GenericQueue[B]= {        // using lower-type-bound
    new GenericQueue[B](list :+ input)
  }

  def dequeue[B>:A]:Try[GenericQueue[B]] ={
    Try (new GenericQueue[B](list.tail))           //using Try() for error handling
  }
}
