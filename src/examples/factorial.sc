package examples

object factorial {

  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)       //> factorial: (n: Int)Int

  factorial(4)                                    //> res0: Int = 24
  factorial(5)                                    //> res1: Int = 120
  factorial(10)                                   //> res2: Int = 3628800
}