package recursivescala_problems

object q4 {
  def main(args:Array[String]) {
     println("Enter number: ");
     var n=scala.io.StdIn.readInt(); 
     if(IsEven(n)==1) 
       println("Even NUmber");
     else
        println("Odd Number");
  }
  
  def IsEven(number:Int) : Int= {
     if(number==0) 
       return 1;
     else
       IsOdd(number-1);
  }
  
  def IsOdd(number:Int) :Int = {
     if(IsEven(number) ==1)
       return 0;
     else
       return 1;
  }
}