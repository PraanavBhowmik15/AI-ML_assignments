package Table

object TableImpl {
  def main(args: Array[String]): Unit={
    val obj=new TableApi()
    val ls=obj.createTable(List(1,2))
    println(ls)
  }

}
