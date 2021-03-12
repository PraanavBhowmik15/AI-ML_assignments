package question1

object DuplicateImpl {
  def main(args: Array[String]):Unit={
    val obj=new Duplicate()
    val listMultiple=obj.duplicate(3,List(1,2,3,4,5))
    print(listMultiple)
  }

}
