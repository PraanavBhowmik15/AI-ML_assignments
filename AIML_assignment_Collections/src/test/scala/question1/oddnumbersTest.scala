package question1
import org.scalatest.flatspec.AnyFlatSpec
class oddnumbersTest extends AnyFlatSpec {
  val expectedresult=List(1,3,5,7,9,11,13,15,17,19)
  val expectedres2=Vector(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
  "THe odd number list" should "is correct" in {
    val obj=new oddnumbers
    val actualresult=obj.forloop
    assert(expectedres2===actualresult)
  }
  "This odd number list" should "is correct" in {
    val obj=new oddnumbers
    val actualresult=obj.filter
    assert(expectedresult===actualresult)
  }
  "This list of odd number" should "is correct" in {
    val obj=new oddnumbers
    val actualresult=obj.map
    assert(expectedresult===actualresult)
  }

}
