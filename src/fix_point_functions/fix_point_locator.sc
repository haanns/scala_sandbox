object initial_implementation {

  val tolerance = 0.0001

  def isCloseEnough(x: Double, y: Double) =
    math.abs((x - y)) / x < tolerance

  def fixedPoint(f: Double => Double) (firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      println("guess is = " + guess)
      val next = f(guess)
      if (isCloseEnough(guess, next)) next else iterate(next)
    }
    iterate(firstGuess)
  }

  def sqrt (x: Double) =
    fixedPoint(y => (y + x / y)/2)(1)

  def averageDamp(f: Double => Double) (x: Double) =
    (x + f(x)) /2

  //This flexibility of being able to write a function that
  // returns either a function or a value depending on how
  // you call it is called currying, and it is a feature of Scala.
  def newSqrt (x: Double) = fixedPoint(averageDamp(y => x/y))(1)
}

initial_implementation.fixedPoint(x => 1 + x/2)(1)