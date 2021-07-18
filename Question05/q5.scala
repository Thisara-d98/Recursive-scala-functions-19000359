package recursivescala_problems

object q5 {
  def main(args:Array[String] ) {
    println("Enter number:");
    var n=scala.io.StdIn.readInt();
    println(SumOfEvenNumbers(n));
  }
  
  def SumOfEvenNumbers(number:Int) : Int= {
    var n:Int=0;
    n=number;
    if(n==0)
      return 0;
    if(n%2==0 ){
      return n+SumOfEvenNumbers(n-2);
    }
    else {
      SumOfEvenNumbers(n-1);
    }
  }
  
}