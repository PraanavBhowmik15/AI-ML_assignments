package question2
import org.scalatest.flatspec.AnyFlatSpec
class SplitList_Test extends AnyFlatSpec {
  "The split list" should "is correct" in{
    val expectedResult1:List[Int]=List(1,2,3)
    val expectedResult2=List(4,5,6)
    val obj=new SplitList()
    val (actualResult1,actualResult2)=obj.splitList(3,List(1,2,3,4,5,6))
    assert(expectedResult1===actualResult1)
    assert(expectedResult2===actualResult2)
  }
}
