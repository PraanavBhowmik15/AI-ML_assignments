class reverse {

  def rev(str: String): String = { // Recursion of string
    val s: String = str.reverse   // Using inbuilt reverse function for string reverse
    s
  }

  def Reverse(string: String): String = { // Recursion of String using tail recursion
    if (string.length == 1) string // Check if Length of string is 1
    else Reverse(string.tail) + string.head // Concatenating substring of string with charAt 0
    }
}


