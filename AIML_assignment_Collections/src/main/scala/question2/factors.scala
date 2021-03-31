package question2

class factors {
  def factor(x: Int) = { 2 to (x-1) filter (x % _ == 0) }

}
