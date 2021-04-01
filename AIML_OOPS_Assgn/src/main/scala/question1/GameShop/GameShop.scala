//Author - Praanav Bhowmik
package question1.GameShop
import question1.Game.Game
import question1.GameConsole.Console
import question1.GameConsoleLibrary.ConsoleLibrary

import scala.collection.MapView

object GameShop extends App {

  val consoles = new ConsoleLibrary()

  val games = List(
    new Game("GTA V", "Rockstar North", List(consoles.Xbox2)),
    new Game("Fifa 21", "Electronic Arts", List(consoles.PS4, consoles.PS5)),
    new Game("Among Us", "InnerSloth LLC", List(consoles.NintendoSwitch)),
    new Game("Counter-Strike", "Valve Corporation", List(consoles.Xbox2))
  )

  val consoleToGames: MapView[Console, List[Game]] = {
    val consoleToGames1: List[(Console, Game)] = games flatMap (g => g.consoles.map(c => c -> g))
    val consoleToGames2: Map[Console, List[(Console, Game)]] = consoleToGames1 groupBy (_._1)
    val consoleToGames3: MapView[Console, List[Game]] = consoleToGames2 mapValues(_ map (_._2))
    consoleToGames3
  }


  def sortGames(): Unit = {
    games sortBy (g => s"${g.maker}_${g.name}") foreach { game =>
      val consoleInfo = game.consoles.map(c => s"${c.make} ${c.model}").mkString(", ")
      print(s"${game.name} by ${game.maker} for $consoleInfo \n")
    }
  }

  print("\ntoString method of Game Class:\n" + games)

  print("\n\nChecking if GTA V isSupported by Xbox2: ")
  val gta5 = new Game("GTA V", "Rockstar North", List(consoles.Xbox2))
  print(gta5.isSupported(consoles.Xbox2))
  print("\nChecking if GTA V isSupported by Nintendo Switch: ")
  print(gta5.isSupported(consoles.NintendoSwitch))


  print("\n\nList of games, sorted first by maker and then by game name: \n\n")
  sortGames()

  print("\n Games Supported by each Console: \n")
  for ((key,value) <- consoleToGames) printf("Console: %s gamesSupported: %s\n\n", key, value)

}
