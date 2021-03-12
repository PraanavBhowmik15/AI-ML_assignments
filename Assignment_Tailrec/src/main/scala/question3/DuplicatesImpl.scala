//Author-Praanav
package question3

object DuplicatesImpl {
  def main(args: Array[String]):Unit={
    val obj=new Duplicates()
    val list=obj.removeDuplicate(List(1,1,2,3,3,4,4,5,8,8))
    print(list)
  }
}
