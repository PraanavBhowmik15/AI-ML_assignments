//Author - Praanav Bhowmik
package question2.LinkList

object MakeLinkListImpl extends App {
  val list=new MakeLinkList[Int](1,2,3,4,5)
  println("List Elements :")
  list foreach println
  println("Head Element: "+ list.item)
  val x=list.apply(1).toString
  println("Elemet at position two " + x)

}
