//Author-Praanav Bhowmik
package OOPs_assignment2

object Compare {
  def main(args: Array[String]): Unit = {

    //comparing the age if the names are same
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test", 25)
    println("personOne('Test' , 24) < personTwo('Test' , 25) : " + (personOne < personTwo) )
    println("personOne('Test' , 24) > personTwo('Test' , 25) : " + (personOne > personTwo) )

    //comparing the length of names if names are not same
    val person1 = new Person("TestAgain", 24)
    val person2 = new Person("Test", 25)
    println("person1('TestAgain' , 24) >= person2('Test' , 25) : " + (person1 >= person2))
    println("person1('TestAgain' , 24) <= person2('Test' , 25) : " + (person1 <= person2))
  }
}
