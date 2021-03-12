package question4
import org.scalatest.flatspec.AnyFlatSpec
class AreaOfCircle_Test extends AnyFlatSpec {
  "The area of circle" should "is correct" in{
    val expectedResult=12.566370614359172
    val obj=new AreaOfCircle()
    val actualresult=obj.areaOfCircle("2")
    assert(expectedResult===actualresult)
  }

}
