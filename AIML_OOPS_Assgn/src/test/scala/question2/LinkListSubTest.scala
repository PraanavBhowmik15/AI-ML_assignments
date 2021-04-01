//Author - Praanav Bhowmik
package question2
import org.scalatest.flatspec.AnyFlatSpec
import question2.LinkListSub.LinkListImpl.list
import question2.LinkListSub.{LinkedListSub, NonEmptyList}
class LinkListSubTest extends AnyFlatSpec {
  val head=1
  val list = new LinkedListSub()
  val newList = new NonEmptyList(head,list.create(2,3,4,5,6))
  //Testing at non-empty list
  "The element at 3rd index position" should " is correct " in {
    val expectedResult="Some(3)"
    val actualResult=newList.apply(2).toString
    assert(expectedResult===actualResult)
  }
  "Head of the list " should " is correct" in {
    val expectedResult=1
    val actualResult=newList.head
    assert(expectedResult===actualResult)
  }
  "Size of the list " should " is correct" in {
    val expectedResult=6
    val actualResult=newList.size
    assert(expectedResult===actualResult)
  }

  //Empty list Testing
  val emptyList = list.create()
  "element in third index " should " is not available" in {
    val expectedResult="None"
    val actualResult=emptyList.apply(2).toString
    assert(expectedResult===actualResult)
  }
  "Head of the list " should "is not available" in {
    val expectedResult="None"
    val actualResult=emptyList.headOption.toString
    assert(expectedResult===actualResult)
  }
}
