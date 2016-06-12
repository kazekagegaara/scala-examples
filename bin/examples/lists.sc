package examples

object lists {
  def sum(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + sum(xs.tail)
  }                                               //> sum: (xs: List[Int])Int

  def max(xs: List[Int]): Int = {
    if (xs.isEmpty) throw new NoSuchElementException

    def maxIter(xs: List[Int]): Int = {
      if (xs.isEmpty) 0
      else getMax(xs.head, maxIter(xs.tail))
    }

    def getMax(x: Int, y: Int): Int = {
      if (x < y) y else x
    }

    maxIter(xs)
  }                                               //> max: (xs: List[Int])Int
  
  sum(List(1,2,3,4))                              //> res0: Int = 10
  sum(List())                                     //> res1: Int = 0
  sum(List(-1,-10,10,100))                        //> res2: Int = 99
  max(List(1,2,4,5,6))                            //> res3: Int = 6
  max(List(-1,-10,10,100))                        //> res4: Int = 100
}