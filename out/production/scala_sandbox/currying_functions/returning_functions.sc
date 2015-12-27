//lecture 2.2 currying
object return_function {
  //testing out a function returning a function
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
      else f(a) + sumF(a + 1, b)
    sumF
  }

  //new simplified functions
  def sumInt = sum (x => x)
  def sumCubes = sum (x => x * x * x)
}

//wait what? even without parameters?
return_function.sumInt(5, 7)
return_function.sumCubes(4, 6)
return_function.sum(x => x * x * x)(1, 5)