package question3
import org.scalatest.flatspec.AnyFlatSpec
class firstX_NoTest extends AnyFlatSpec {
  "The list " should "is correct" in {
    val expectedResult=List(1,2,3)
    val obj=new firstX_No
    val actualResult=obj.first(List(1,2,3,4,5,6,7),3)
    assert(expectedResult===actualResult)
  }
}
