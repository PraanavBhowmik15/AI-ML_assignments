//Author - Praanav Bhowmik
package question2.LinkListSub

import scala.annotation.tailrec

class LinkedListSub {
  def create[A](items: A*):LinkedList[A] = {
    var result: LinkedList[A] = new EmptyList[A]
    for (item <- items.reverse) {
      result = new NonEmptyList[A](item, result)
    }
    result
  }
}

abstract class LinkedList[A] {
  def foreach(elements: A => Unit): Unit
  def apply(index: Int): Option[A]

  def headOption: Option[A] = apply(0)

  lazy val head: A = headOption.get

  def tail: LinkedList[A]

  def ::(a: A): LinkedList[A] = new NonEmptyList[A](a, this)

  def filter(f: A => Boolean): LinkedList[A] = {

    @tailrec
    def filterLists(src: LinkedList[A], dest: LinkedList[A], f: A => Boolean): LinkedList[A] = {
      src.headOption match {
        case Some(i) if f(i) => filterLists(src.tail, i :: dest, f)
        case Some(i) => filterLists(src.tail, dest, f)
        case None => dest
      }
    }

    val result: LinkedList[A] = filterLists(this, new EmptyList[A], f)
    result.reverse
  }


  lazy val size: Int = {
    @tailrec
    def count(inputList: LinkedList[A], totalElements: Int): Int = {
      inputList.headOption match {
        case Some(i) => count(inputList.tail, totalElements + 1)
        case None => totalElements
      }
    }

    count(this, 0)
  }

  def map[B](f: A => B): LinkedList[B] = {

    @tailrec
    def mapLists[B](src: LinkedList[A], dest: LinkedList[B], f: A => B): LinkedList[B] = {
      src.headOption match {
        case Some(i) => mapLists(src.tail, f(i) :: dest, f)
        case None => dest
      }
    }

    val result: LinkedList[B] = mapLists(this, new EmptyList[B], f)
    result.reverse
  }

  lazy val reverse: LinkedList[A] = {
    @tailrec
    def reverseLists(inputList: LinkedList[A], reversedList: LinkedList[A]): LinkedList[A] = {
      inputList.headOption match {
        case Some(i) => reverseLists(inputList.tail, i :: reversedList)
        case None => reversedList
      }
    }
    reverseLists(this, new EmptyList[A])
  }
}

class NonEmptyList[A](val item: A, val tail: LinkedList[A]) extends LinkedList[A] {

  override def foreach(elements: A => Unit): Unit = {
    elements(item)
    tail.foreach(elements)
  }

  override def apply(index: Int): Option[A] = {
    if (index < 1) Some(item) else tail.apply(index - 1)
  }
}

class EmptyList[A] extends LinkedList[A] {
  override def foreach(elements: A => Unit): Unit = {}
  override def apply(index: Int): Option[A] = None
  override def tail: LinkedList[A] =  null
}