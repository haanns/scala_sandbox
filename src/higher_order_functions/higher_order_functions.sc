object higher_order_functions {

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

higher_order_functions.sumInts(3, 7)

higher_order_functions.cubeInts(3, 5)