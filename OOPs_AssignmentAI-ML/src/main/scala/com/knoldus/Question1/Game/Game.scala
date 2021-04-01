//Author - Praanav Bhowmik
package com.knoldus.Question1.Game

import com.knoldus.Question1.GameConsole.GameConsole

class Game (val name: String, val maker: String, val consoles: List[GameConsole]) {
  def isSupported(console: GameConsole): Boolean = {
    consoles contains console
  }

  override def toString = s"Game($name, by $maker)"

}