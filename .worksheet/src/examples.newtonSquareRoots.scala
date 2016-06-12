package examples

object newtonSquareRoots {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(370); 

  def sqrt(x: Double) = {

    def sqrtItr(guess: Double): Double = {
      if (isGoodEnough(guess)) guess
      else sqrtItr(improve(guess))
    }

    def isGoodEnough(guess: Double) =
      math.abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtItr(1.0)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(14); val res$0 = 
  
  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 
  sqrt(1e-6);System.out.println("""res2: Double = """ + $show(res$2));$skip(13); val res$3 = 
  sqrt(1e60);System.out.println("""res3: Double = """ + $show(res$3))}
}
