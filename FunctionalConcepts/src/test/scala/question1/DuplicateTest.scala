package question1
import org.scalatest.flatspec.AnyFlatSpec
class DuplicateTest extends AnyFlatSpec {
  "The Duplicate" should "is correct" in {
    val expectedResult=List(1,1,1,2,2,2)
    val obj=new Duplicate()
    val actualResult=obj.duplicate(3,List(1,2))
    assert(expectedResult===actualResult)
  }

}
