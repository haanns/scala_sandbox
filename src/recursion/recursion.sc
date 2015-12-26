//week one lecture 7
//understanding recursions
object recursion {
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

recursion.gcd(14, 21)

//understanding factorials
//below doesn't work, need to find a different way
object factorial {
  var y = 1
  def factorial (x: Int): Int =
    if (x == 0) y else y
}

factorial.factorial(5)

//second attempt at factorials
object factorial_works {
  def factorial (x: Int): Int =
    if (x == 0) 1 else x * factorial(x-1)
}

factorial_works.factorial(4)