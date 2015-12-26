//week one lecture 7
//understanding recursions
object recursion {
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a%b)

}