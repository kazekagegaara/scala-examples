package examples

object euclidgcd {
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)              //> gcd: (a: Int, b: Int)Int

  gcd(14, 21)                                     //> res0: Int = 7
  gcd(21, 14)                                     //> res1: Int = 7
}