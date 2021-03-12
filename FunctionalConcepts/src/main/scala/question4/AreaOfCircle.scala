package question4

class AreaOfCircle {
  def areaOfCircle(radiusOfCircle: String): Double = {
    if (radiusOfCircle.isEmpty) 0
     else {
      math.pow(radiusOfCircle.toDouble, 2) * math.Pi
    }
  }
}
