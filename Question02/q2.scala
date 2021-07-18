package recursivescala_problems

object q2 {
  def main(args:Array[String]) {
    println("Enter number:");
    var n=scala.io.StdIn.readInt();
    PrimeSeq(n);
  }
  
  def PrimeSeq(number:Int ) {
      Prime(number,2);     //Calls another function  
      var value=number;
      value=value-1;
      if(value==0)
         return;
      else
        PrimeSeq(value); //Use recursive PrimeSeq(n) function
  }
  
def Prime (number:Int,divider:Int) {
    var remainder:Int=0;
    var d:Int=0;
    if(number==2)
      println(number);
    else {
       remainder=number%divider;
       d=divider;
       if(remainder==0)
        return ;
      else {
        d=d+1;
        if(d==number)
          println(number);
        else
          Prime(number,d);
      }
    }
   
}

}