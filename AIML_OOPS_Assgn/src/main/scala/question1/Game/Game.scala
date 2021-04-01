//Author - Praanav Bhowmik
package question1.Game

import question1.GameConsole.Console

class Game(val name: String, val maker: String, val consoles: List[Console]) {

  def isSupported(console: Console): Boolean = consoles.contains(console)

  override def toString : String = s"Game($name, by $maker)"

}
