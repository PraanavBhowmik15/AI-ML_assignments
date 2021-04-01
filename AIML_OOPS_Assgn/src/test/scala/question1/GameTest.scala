//Author - Praanav Bhowmik
package question1

import org.scalatest.flatspec.AnyFlatSpec
import question1.Game.Game
import question1.GameConsoleLibrary.ConsoleLibrary

class GameTest extends AnyFlatSpec {

  val consoles = new ConsoleLibrary()
  val gta5 = new Game("GTA V", "Rockstar North", List(consoles.Xbox2))

  "The toString method" should "be valid" in {
    val actualResult = gta5.toString
    val expectedResult = "Game(GTA V, by Rockstar North)"
    assert(actualResult === expectedResult)
  }

  "The toString method" should "be invalid" in {
    val actualResult = gta5.toString
    val expectedResult = "GTA V, by Rockstar North"
    assert(actualResult != expectedResult)
  }

  "The isSupported method" should "be valid" in {
    val actualResult = gta5.isSupported(consoles.Xbox2)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "The isSupported method" should "be invalid" in {
    val actualResult = gta5.isSupported(consoles.NintendoSwitch)
    val expectedResult = true
    assert(actualResult != expectedResult)
  }

}
