//xyz

import org.scalatest.flatspec.AnyFlatSpec
class Calculator_test extends AnyFlatSpec {
  val a=10
  val b=20
  val c=5
  val d=2
  "The sum" should " is write" in {
    val sum=new Calculator()
    val s=sum.addition(a,b)
    val expectedResult = 30
    assert(s === expectedResult)
  }

  "The substraction" should " is write" in {
    val sub=new Calculator()
    val s=sub.subtraction(a,b)
    val expectedResult = -10
    assert(s === expectedResult)
  }

  "The multiplicaiton" should " is write" in {
    val mull=new Calculator()
    val s=mull.multiplication(a,b)
    val expectedResult = 200
    assert(s === expectedResult)
  }

  "The division" should " is write" in {
    val div=new Calculator()
    val s=div.division(b,a)
    val expectedResult = 2
    assert(s === expectedResult)
  }

  "The Power" should " is write" in {
    val pow=new Calculator()
    val s=pow.power(c,d)
    val expectedResult = 25
    assert(s === expectedResult)
  }

  "The absolute" should " is write" in {
    val abs=new Calculator()
    val s=abs.absolute(a)
    val expectedResult = 10
    assert(s === expectedResult)
  }

  "The Modulus" should " is write" in {
    val mod=new Calculator()
    val s=mod.modulus(b,a)
    val expectedResult = 0
    assert(s === expectedResult)
  }

  "The Maximum" should " is write" in {
    val max=new Calculator()
    val s=max.maximum(a,b)
    val expectedResult = 20
    assert(s === expectedResult)
  }

  "The Minimum" should " is write" in {
    val min=new Calculator()
    val s=min.minimum(a,b)
    val expectedResult = 10
    assert(s === expectedResult)
  }

}
