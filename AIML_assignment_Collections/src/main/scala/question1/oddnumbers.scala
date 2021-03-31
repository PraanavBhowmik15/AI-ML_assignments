package question1

class oddnumbers {
  def forloop: IndexedSeq[Long]= {
    for (i <- 0 to 9; result = i * 2 + 1) yield result
  }
  def filter: List[Int] ={
    val ll=List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val result: List[Int]=ll.filter(_ % 2 == 1)
    result
  }
  def map: List[Int]={
    val ll=List(0,1,2,3,4,5,6,7,8,9)
    val result=ll.map(_*2 + 1)
    result
  }

}
