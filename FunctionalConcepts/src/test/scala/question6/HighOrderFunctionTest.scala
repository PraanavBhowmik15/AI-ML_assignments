package question6
import org.scalatest.flatspec.AnyFlatSpec
class HighOrderFunctionTest extends AnyFlatSpec {
  "The maximum in tuple" should "is correct" in{
    val expectedresult=5
    val obj=new HighOrderFunction()
    val actualresult=obj.pickMaxInHigherOrderFunction((1,4,5),obj.maxTwoNumbers)
    assert(expectedresult===actualresult)
  }
}
