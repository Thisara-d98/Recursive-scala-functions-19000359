package recursivescala_problems

object q3 {
  def main(args:Array[String]) {
    println("Enter number:");
    var n=scala.io.StdIn.readInt();
    println(Sum(n));
  }
  
  def Sum(numbers:Int) : Int= {
    var sum:Int=0;
    var curr_number=numbers;
    if(curr_number==0)
      return 0;
    return curr_number+Sum(curr_number-1);
    
   
  }
}