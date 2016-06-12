package examples

object factorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(114); 

  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1);System.out.println("""factorial: (n: Int)Int""");$skip(17); val res$0 = 

  factorial(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  factorial(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(16); val res$2 = 
  factorial(10);System.out.println("""res2: Int = """ + $show(res$2))}
}
