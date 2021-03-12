package question5

class MatchWithZero {
  def matchingzero(value:Double):String={
    value match{
      case value if value > 0 => "greater"
      case value if value < 0 => "smaller"
      case value if value == 0 => "same"
    }
  }

}
