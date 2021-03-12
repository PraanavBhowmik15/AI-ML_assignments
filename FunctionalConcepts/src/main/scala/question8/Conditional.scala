package question8

class Conditional {
  def conditional[A](x: A, p: A => Boolean, f: A => A): A = {
    if (p(x)) f(x) else x
  }
}
