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

//even more simplified
object return_function_equiv {
  def sum(f: Int => Int) (a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)
}

//write a product function that calculates the product of the values
//of a function for the points on a given interval.
object exercise {

  //first, let's try out products
  def product (f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1 else f(a) * product(f)(a + 1, b)

  //factorial with products
  def factorial (n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

  //factorial USING products
  def factorial_using_products (n: Int): Int =
    product(x => x)(1, n)
}

//now let's test this
exercise.product(x => x * x)(3, 7)
//jesus that was so easy
exercise.factorial_using_products(5)

