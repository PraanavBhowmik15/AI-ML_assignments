package question3
import org.scalatest.flatspec.AnyFlatSpec
class DuplicateListTest extends AnyFlatSpec {
    "The Duplicate List" should "is correct" in{
      val expectedResult=List(1,1,2,2,3,3)
      val obj=new DuplicateList()
      val actualResult=obj.duplicateList(List(1,2,3))
      assert(expectedResult===actualResult)
    }

}
