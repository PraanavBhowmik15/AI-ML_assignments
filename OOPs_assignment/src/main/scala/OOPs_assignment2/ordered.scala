//Author-Praanav Bhowmik
package OOPs_assignment2

trait ordered[A] extends Any with java.lang.Comparable[A] {


  def compare(that: A): Int

  // Returns true if this is less than that

  def <  (that: A): Boolean = (this compare that) <  0

  //Returns true if this is greater than that.

  def >  (that: A): Boolean = (this compare that) >  0

  //Returns true if this is less than or equal to that.

  def <= (that: A): Boolean = (this compare that) <= 0

  //Returns true if this is greater than or equal to that.

  def >= (that: A): Boolean = (this compare that) >= 0

  //Result of comparing this with operand that.

  def compareTo(that: A): Int = compare(that)
}

object Ordered {
  implicit def orderingToOrdered[T](x: T)(implicit ord: Ordering[T]): T => Int =
    (that: T) => ord.compare(x, that)
}
