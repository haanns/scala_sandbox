object newton {

  def abs (x: Double) = if (x < 0) -x else x

  def sqrt (x: Double) = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double): Boolean =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double, x: Double): Double =
      (guess + x / guess) / 2


    sqrtIter(1.0, x)
  }
}

newton.abs(-15)
newton.sqrt(2)
newton.sqrt(4)
