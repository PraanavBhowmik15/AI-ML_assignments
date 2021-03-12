package question2

object SplitListImpl {
  def main(args: Array[String]):Unit={
    val obj=new SplitList()
    val (list1,list2)=obj.splitList(3,List(1,2,3,4,5,6))
    print(list1,list2)
  }
}
