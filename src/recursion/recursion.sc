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

//my attempt of using tail recursive version of factorials
//not correct, need to find a different way of doing this
object tail_recursion_factorial {
  def factorial (x: Int): Int =
    if (x == 0) return x else return x * (x - 1);
}

tail_recursion_factorial.factorial(4)

//correct attempt of using tail recursion to calculate
//factorials

object functioning_tail_recursion_factorial {
  def factorial (n: Int): Int = {
    def loop (acc: Int, n: Int): Int =
      if (n == 0) acc else loop(acc * n, n - 1)
    loop(1, n)
  }
}

functioning_tail_recursion_factorial.factorial(5)