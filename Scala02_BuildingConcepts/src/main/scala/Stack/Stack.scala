package Stack

class Stack {
  var top:Int = -1            //Declaring top of stack as -1, denoting it is empty
  var list:List[Any] = List() //Declaring stack list of any type

  def push(element:Any):Unit={
    top = top + 1
    list = list ::: List(element)

  }

  def isEmpty:Boolean = {
    if(top < 0) true
    else
      false
  }

  def peek():Any={
    if(!isEmpty) list(top)
    else "Stack is Empty"
  }

  def pop():Any= {
    if (top < 0) "Stack Underflow"
    else{
      top = top - 1
      list = list.dropRight(1)
    }

  }

  def display():Any={
    if (top < 0) "Stack is Underflow"
    else {
      var temp:Int = top
      while (temp > 0) {
        print(list(temp)+"->")
        temp = temp - 1
      }
    }
  }
}
