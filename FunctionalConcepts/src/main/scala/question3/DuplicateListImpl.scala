package question3

object DuplicateListImpl {
  def main(args: Array[String]):Unit={
    val obj=new DuplicateList()
    val outputList=obj.duplicateList(List(1,2,3,4,5))
    print(outputList)
  }
}
