package question2
import org.scalatest.flatspec.AnyFlatSpec
class factorsTest extends AnyFlatSpec {
  "The factors" should " is correct" in {
    val expectedReslt=List(3, 5)
    val obj=new factors
    val actualResult=obj.factor(15)
    assert(expectedReslt===actualResult)
  }
}
