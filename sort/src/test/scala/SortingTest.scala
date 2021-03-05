import org.scalatest.flatspec.AnyFlatSpec
class SortingTest extends AnyFlatSpec {
  val input1 = 20
  val input2 = 40
  val input3 = 10
  val input4 = 50
  val input5 = 30
  "Sorting" should "is correct" in {
    val expectedSorting = Array(input3,input1,input5,input2,input4)
    val objectOfSorting = new Sorting()
    val ActualSorting = objectOfSorting.sort(Array(input1,input2,input3,input4,input5))
    assert(ActualSorting===expectedSorting)
  }

}
