//Author - Praanav Bhowmik
package question2.LinkListSub

object LinkListImpl extends App {
  val list = new LinkedListSub()
  val head = 1

  //Non-Empty List operations

  print("OPERATIONS ON NON EMPTY LIST: \n")
  val newList = new NonEmptyList(head,list.create(2,3,4,5,6))
  print("Elements in List: ")
  newList.foreach(print)
  print("\nThird Element in List: " + newList.apply(2))

  val tailElements = newList.tail
  print("\nTail Elements in List: ")
  tailElements.foreach(print)

  print("\nHead value in List: " + newList.head)

  print("\nSize of List is: " + newList.size)

  val reversedList = newList.reverse
  print("\nReversed List is: ")
  reversedList.foreach(print)

  print("\nFilter (Even Numbers in List): ")

  val filterResult = newList.filter((_ % 2 == 0))
  filterResult.foreach(print)


  print("\nList after calling Map method(Multiplying each data by 3): ")
  val result = newList.map(_ * 3)
  result.foreach(print)


  //Empty list Operations

  print("\nOPERATIONS ON EMPTY LIST: \n")

  val emptyList = list.create()

  print("Elements in List: ")
  emptyList.foreach(print)

  println("Third Element in List: " + emptyList.apply(2))

  println("Tail Elements in List: " + emptyList.tail)

  println("Head Element in List: " + emptyList.headOption)

  println("Size of List: " + emptyList.size)

}
