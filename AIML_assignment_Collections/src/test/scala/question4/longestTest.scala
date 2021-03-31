package question4
import org.scalatest.flatspec.AnyFlatSpec
class longestTest extends AnyFlatSpec {
  val names: List[String]=List("Ron","Hermione", "Harry", "Snape")
  val expectedResult="Hermione"
  "The longest string with generic" should " is correct" in {
    val obj=new longest
    val actualResult=obj.long[String](names, (x,y) => if (x.length > y.length) x else y)
    assert(actualResult===expectedResult)
  }
  "The longest string with fold " should " is valid" in {
    val obj=new longest
    val actualResult = obj.longestWithFold(names)
    assert(actualResult === expectedResult)
  }
  "The longest string with reduce" should " is valid" in {
    val obj=new longest
    val actualResult = obj.longestWithReduce(names)
    assert(actualResult === expectedResult)
  }
}
