package question8
import org.scalatest.flatspec.AnyFlatSpec
class ConditionalTest extends AnyFlatSpec {
  "The output" should "is correct" in{
    val expectedresult="olleH"
    val obj=new Conditional()
    val output=obj.conditional[String]("Hello", _.length > 4, _.reverse)
    assert(expectedresult===output)
  }

}
