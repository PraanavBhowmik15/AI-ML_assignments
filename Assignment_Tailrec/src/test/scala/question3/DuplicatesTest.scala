package question3
import org.scalatest.flatspec.AnyFlatSpec
class DuplicatesTest extends AnyFlatSpec {
  "The revised list" should "is correct" in {
    val expectedresult=List(1, 2, 3, 4, 5, 8)
    val obj=new Duplicates()
    val actualresult=obj.removeDuplicate(List(1,1,2,3,3,4,4,5,8,8))
    assert(expectedresult===actualresult)
  }

}
