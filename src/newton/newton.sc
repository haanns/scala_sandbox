object newton {
  def abs (x: Double) = if (x < 0) -x else x
  def sqrtIter(guess: Double, x: Double): Double = {
    if isGoodEnough(guess, x) guess
    else sqrtIter(improve(guess, x), x)
  }
}

newton.abs(-15)