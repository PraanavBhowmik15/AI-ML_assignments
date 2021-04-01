//Author - Praanav Bhowmik
package com.knoldus.Question1.GameConsole

import com.knoldus.Question1.MediaFormat.MediaFormat
import com.knoldus.Question1.VideoResolution.VideoResolution

import java.util.Date

class GameConsole (val make: String, val model: String, val debut: Date, val wifiType: Option[String],
                   val mediaFormats: List[MediaFormat], val maxVideoResolution: VideoResolution){

  override def toString = s"GameConsole($make, $model), max video resolution = ${maxVideoResolution.getClass.getName}"
}
