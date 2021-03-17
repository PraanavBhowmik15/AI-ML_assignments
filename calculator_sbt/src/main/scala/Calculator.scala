//xyz

class Calculator  {

  // Addition Method for adding two numbers
  def addition (number_1 : Int , number_2 : Int) : Int  = number_1 + number_2

  // Subtraction method
  def subtraction(number_1 : Int , number_2 : Int) : Int = number_1 - number_2

  // Multiplication method for multiplying two numbers
  def multiplication(number_1 : Int , number_2 : Int) : Int = number_1 * number_2

  // Division Method
  def division (number_1 : Int , number_2 : Int) : Any = {
    if (number_2 > 0)
    number_1 / number_2
    else
      "Denominator can not be 0"
  }

  // power method for calculating power of a number
  def power(number_1: Int, number_2: Int): Double = Math.pow(number_1, number_2)

  // Absolute method for calculating absolute value
  def absolute(number:Int):Int = Math.abs(number)

  // Modulus method
  def modulus(number_1:Int , number_2:Int):Int = number_1 % number_2

  // Maximum method for calculating maximum between two numbers
  def maximum(number_1:Int , number_2:Int):Int = if(number_1 > number_2) number_1 else number_2

  // Minimum method for calculating minimum between two numbers
  def minimum(a:Int,b:Int):Int = if(a<b) a else b

}