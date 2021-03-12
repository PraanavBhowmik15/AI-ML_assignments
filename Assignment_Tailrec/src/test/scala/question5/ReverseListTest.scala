package question5
import org.scalatest.flatspec.AnyFlatSpec
class ReverseListTest extends AnyFlatSpec {
  "The reverse list" should "is correct" in{
    val expectedresult=List(5, 4, 3, 2, 1)
    val obj=new ReverseList()
    val actualresult=obj.reverseList(List(1,2,3,4,5))
    assert(expectedresult===actualresult)
  }
}
