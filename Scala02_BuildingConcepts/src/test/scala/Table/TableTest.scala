package Table
import org.scalatest.flatspec.AnyFlatSpec
class TableTest extends AnyFlatSpec {
  "The Table" should "is correct" in {
    val expectedResult= List(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20))
    val obj =new TableApi()
    val actualResult = obj.createTable(List(1,2))
    assert(expectedResult===actualResult)
  }

}
