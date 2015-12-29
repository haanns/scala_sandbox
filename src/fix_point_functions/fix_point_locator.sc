object initial_implementation {

  val tolerance = 0.0001

  def isCloseEnough(x: Double, y: Double) =
    math.abs((x - y)) / x < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next else iterate(next)
    }
    iterate(firstGuess)
  }

}

