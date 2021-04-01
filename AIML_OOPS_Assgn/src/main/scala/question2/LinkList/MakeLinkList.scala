//Author - Praanav Bhowmik
package question2.LinkList

class MakeLinkList[A](items: A*) {

  val item: Option[A] = items.headOption

  val next: Option[MakeLinkList[A]] = {
    if (item.isDefined) Some(new MakeLinkList(items.tail: _*)) else None
  }

  def foreach(f: A => Unit): Unit = {
    for {i <- item; n <- next} {
      f(i)
      n.foreach(f)
    }
  }

  def apply(index: Int): Option[A] = {
    if (index < 1) item else next flatMap (_.apply(index - 1))
  }
}
