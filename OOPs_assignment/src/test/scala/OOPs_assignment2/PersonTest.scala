//Author-Praanav Bhowmik
package OOPs_assignment2
import org.scalatest.flatspec.AnyFlatSpec
class PersonTest extends AnyFlatSpec {
    "Person two" should "age is greater than person1" in{
      val expectedResult=true
      val person1=new Person("Praanav",22)
      val person2=new Person("Praanav",24)
      val actualResult = person1 < person2
      assert(expectedResult===actualResult)
    }
  "Person one" should "name length is larger than person1" in{
    val expectedResult=true
    val person1=new Person("Praanav",22)
    val person2=new Person("Rohit",24)
    val actualResult = person1 > person2
    assert(expectedResult===actualResult)
  }
}
