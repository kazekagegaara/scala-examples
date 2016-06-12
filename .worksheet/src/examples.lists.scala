package examples

object lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(125); 
  def sum(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + sum(xs.tail)
  };System.out.println("""sum: (xs: List[Int])Int""");$skip(302); 

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
  };System.out.println("""max: (xs: List[Int])Int""");$skip(24); val res$0 = 
  
  sum(List(1,2,3,4));System.out.println("""res0: Int = """ + $show(res$0));$skip(14); val res$1 = 
  sum(List());System.out.println("""res1: Int = """ + $show(res$1));$skip(27); val res$2 = 
  sum(List(-1,-10,10,100));System.out.println("""res2: Int = """ + $show(res$2));$skip(23); val res$3 = 
  max(List(1,2,4,5,6));System.out.println("""res3: Int = """ + $show(res$3));$skip(27); val res$4 = 
  max(List(-1,-10,10,100));System.out.println("""res4: Int = """ + $show(res$4))}
}
