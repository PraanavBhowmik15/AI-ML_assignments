package LastElement

import org.scalatest.flatspec.AnyFlatSpec
class LastElementTest extends AnyFlatSpec {
  "Last Element" should "is correct" in {
    val testList: List[Any] = List(1,2,3,"Apple","Mango")
    val expectedResult = "Mango"
    val objectOfList = new LastElementApi()
    val ActualResult= objectOfList.lastElement(testList)
    assert(expectedResult===ActualResult)
  }

}
