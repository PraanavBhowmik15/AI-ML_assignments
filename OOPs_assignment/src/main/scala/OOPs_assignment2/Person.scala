//Author-Praanav Bhowmik
package OOPs_assignment2

class Person(val name: String, val age: Int) extends Ordered[Person] { // Ordered Trait
  def compare(that: Person): Int = { //compare method for comparing
    if (this.name == that.name) { //check if names are equal then compare on the basis of age
      if (this.age < that.age) this.age - that.age
      else that.age - this.age
    }
    else { //if names are not equal then compare the length of names
      if (this.name.length < that.name.length) this.name.length - that.name.length
      else this.name.length - that.name.length
    }
  }
}


