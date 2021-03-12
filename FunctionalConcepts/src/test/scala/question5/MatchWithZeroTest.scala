package question5
import org.scalatest.flatspec.AnyFlatSpec
class MatchWithZeroTest extends AnyFlatSpec {
  "The matching" should "is correct" in {
    val expectedResult="greater"
    val obj=new MatchWithZero()
    val actualResult=obj.matchingzero(0.12)
    assert(expectedResult===actualResult)
  }
}
