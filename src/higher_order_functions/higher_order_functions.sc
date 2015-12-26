
//my attempt at higher order functions
object higher_order_functions_testing {

  //sum of all integers between a and b
  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)

  //sum of the cube of all integers between a and b
  def cubeInts(a: Int, b: Int): Int =
    if (a > b) 0 else a * a * a + cubeInts(a + 1, b)

  //sum of all the factorials of the ints between a and b
  //define the factorial first
  def factorial_of_num (a: Int): Int =
    if (a == 0) 1 else a * factorial_of_num(a - 1)

  //now define the sum of factorials
  def sumFactorials (a: Int, b: Int): Int =
    if (a > b) 0 else factorial_of_num(a) + sumFactorials(a + 1, b)
}

//testing out my functions
higher_order_functions_testing.sumInts(3, 7)
higher_order_functions_testing.cubeInts(3, 5)

//instructor's way of doing it below
object higher_order_functions_actual {

  //this is essentially an F(x) function
  def sum (f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  //defining my F(x) functions
  def sumInts (a: Int, b: Int) = sum(id, a , b)
  def sumCubes (a: Int, b: Int) = sum(cube, a, b)
  def sumFactorials(a: Int, b: Int) = sum(fact, a, b)

  def id (x: Int): Int = x
  def cube (x: Int): Int = x * x * x
  def fact (x: Int): Int = if (x == 0) 1 else fact(x - 1)
}