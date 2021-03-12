package question1

class Duplicate {
  def duplicate[Any](multiple: Int, inputList: List[Any]): List[Any] = {
    inputList flatMap {
      List.fill(multiple)(_)
    }
  }
}
