package question7
import org.scalatest.flatspec.AnyFlatSpec
class NestedFunctionTest extends AnyFlatSpec {
  "The product" should "is correct" in {
    val expectedresult = 21
    val obj = new NestedFunction()
    val output1: Int => Int = obj.productOfTwoNumbers(7)
    val actualresult: Int = output1(3)
    assert(expectedresult === actualresult)
  }

}
