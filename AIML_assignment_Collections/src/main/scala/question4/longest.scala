package question4

class longest {
  def longestWithFold(list: List[String]): String = {
    list.fold("")((a,b) => if (a.length < b.length) b else a)
  }

  //method returning the longest string from the List of strings with reduce method
  def longestWithReduce(list: List[String]): String = {
    list.reduce((a,b) => if (a.length < b.length) b else a)
  }
  def long[A](l: List[A], max: (A,A) => A): A = {
    l reduce ((a,i) => max(a,i))
      }
}
