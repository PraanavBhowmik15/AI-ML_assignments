package question3

class DuplicateList {
  def duplicateList[Any](inputList: List[Any]): List[Any] = inputList.flatMap(x => List[Any](x, x))

}
