package question2
import org.scalatest.flatspec.AnyFlatSpec
class KthElementTest extends AnyFlatSpec {
  "The element" should "is correct" in {
    val expectedresult=3
    val obj=new KthElement()
    val actualresult=obj.findElement(List(1,2,3,4,5),0,2)
    assert(expectedresult===actualresult)
  }
}
