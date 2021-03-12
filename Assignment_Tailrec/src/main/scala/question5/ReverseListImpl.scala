//Author-Praanav
package question5

object ReverseListImpl {
  def main(args: Array[String]): Unit={
    val obj=new ReverseList()
    val list=obj.reverseList(List(1,2,3,4,5))
    println(list)
  }
}
