package Stack
import org.scalatest.flatspec.AnyFlatSpec
class StackTest extends AnyFlatSpec {
  "The Stack implementation" should "is correct" in {
    val obj=new Stack()
    obj.push(10)
    obj.push(20)
    obj.push(30)
    obj.push(40)
    val expectedResult=40
    val actualResult=obj.peek()
    assert(expectedResult===actualResult)
  }
}
