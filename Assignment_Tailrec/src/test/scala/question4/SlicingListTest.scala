package question4
import org.scalatest.flatspec.AnyFlatSpec
class SlicingListTest extends AnyFlatSpec {
  "The sliced lsit" should "is correct" in{
    val expectedresult=List(2, 3, 4)
    val obj=new SlicingList()
    val actualresult=obj.slice(1,4,List(1,2,3,4,5,6,7))
    assert(expectedresult===actualresult)
  }
}
