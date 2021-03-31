package question5
import org.scalatest.flatspec.AnyFlatSpec
class TupleListTest extends AnyFlatSpec {
  "The tuple list" should "is correct" in {
    val pall = List("Hi", "otto", "yo", "racecar")
    val expextedResult:(List[String], List[String]) = (List("otto", "racecar"),List("Hi", "yo"))
    val obj=new TupleList
    val actualResult=obj.splitPal(pall)
    assert(expextedResult===actualResult)
  }

}
