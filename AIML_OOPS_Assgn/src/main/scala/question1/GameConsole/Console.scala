//Author - Praanav Bhowmik

package question1.GameConsole

import question1.MediaFormat.MediaFormat
import question1.VideoResolution.VideoResolution

import java.util.Date

class Console(val make: String, val model: String, val debut: Date, val wifiType: Option[String],
                  val mediaFormats: List[MediaFormat], val maxVideoResolution: VideoResolution) {

  override def toString: String = {
    s"GameConsole(Make: $make, Model: $model) launched on $debut.\n"
  }
}
