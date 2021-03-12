//Author-Praanav
package question4
object SlicingListImpl {
  def main(args: Array[String]): Unit={
    val obj=new SlicingList()
    val list=List(1,2,3,4,5,6,7)
    val l=obj.slice(1,4,list)
    print(l)
  }
}
