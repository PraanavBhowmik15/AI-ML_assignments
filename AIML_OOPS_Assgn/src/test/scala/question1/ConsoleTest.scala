//Author - Praanav Bhowmik
package question1
import org.scalatest.flatspec.AnyFlatSpec
import question1.GameConsole.Console
import question1.MediaFormat.CartridgeMediaFormat
import question1.VideoResolution.HD

import java.util.Date

class ConsoleTest extends AnyFlatSpec {

  // Converts String to Date.
  def strToDate(s: String): Date = {
    val format = new java.text.SimpleDateFormat("yyyy-MM-dd")
    format.parse(s)
  }

  val Xbox2 = new Console("Microsoft", "X", strToDate("2020-11-10"), Some("a/b"),
    List(new CartridgeMediaFormat), new HD)

  "The toString method" should "be valid" in {
    val actualResult = Xbox2.toString
    val expectedResult = "GameConsole(Make: Microsoft, Model: X) launched on Tue Nov 10 00:00:00 IST 2020.\n"
    assert(actualResult === expectedResult)
  }

  "The toString method" should "be invalid" in {
    val actualResult = Xbox2.toString
    val expectedResult = "GameConsole(Make: Microsoft, Model: X)"
    assert(actualResult != expectedResult)
  }

}

