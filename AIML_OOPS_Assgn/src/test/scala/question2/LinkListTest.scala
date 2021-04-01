//Author - Praanav Bhowmik
package question2
import org.scalatest.flatspec.AnyFlatSpec
import question2.LinkList.MakeLinkList
class LinkListTest extends AnyFlatSpec {

  val list=new MakeLinkList[Int](1,2,3,4,5)
  "The Hesd Option" should "is correct" in {
    val expectedResult="Some(1)"
    val actualResult=list.item.toString
    assert(expectedResult===actualResult)
  }
  "The element 2nd position index" should " is correct " in {
    val expectedResult="Some(2)"
    val actualResult=list.apply(1).toString
    assert(expectedResult===actualResult)
  }
}
