import org.scalatest.flatspec.AnyFlatSpec

class reversetest extends AnyFlatSpec {
  "Reverse is" should " is write" in{
    val str="Praanav Bhowmik"
    val r=str.reverse
    val obj = new reverse()
    val rever=obj.rev(str)
    assert(rever === r)
  }

  "This Reverse is" should " is write" in{
    val str="Tail recursion"
    val r=str.reverse
    val obj = new reverse()
    val rever=obj.Reverse(str)
    assert(rever === r)
  }


}
