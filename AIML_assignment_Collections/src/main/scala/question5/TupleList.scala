package question5

class TupleList {
  def splitPal(l: List[String]): (List[String], List[String]) = l partition (s => s == s.reverse)
}
