package recursivescala_problems

object q1 {
  
  def main(Args:Array[String]) {
    println("Enter number:");
    var n=scala.io.StdIn.readInt();
     val v= Prime(n,2);
     if(v==1)
       println("Prime Number");
     else
       println("Composite num");
  }
  
  def Prime (number:Int,divider:Int) : Int = {
    var remainder:Int=0;
    var d:Int=0;
    remainder=number%divider;
    d=divider;
    if(remainder==0)
      return 0;
    else {
      d=d+1;
      if(d==number)
        return 1;
      else
        Prime(number,d);
    
    }
  }
}
