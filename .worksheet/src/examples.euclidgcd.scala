package examples

object euclidgcd {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(107); 
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b);System.out.println("""gcd: (a: Int, b: Int)Int""");$skip(16); val res$0 = 

  gcd(14, 21);System.out.println("""res0: Int = """ + $show(res$0));$skip(14); val res$1 = 
  gcd(21, 14);System.out.println("""res1: Int = """ + $show(res$1))}
}
