package recursivescala_problems

object q6 {
  def main(args:Array[String]) {
    var i:Int =0;
    println("Enter number:");
    var n=scala.io.StdIn.readInt();
    while(i<=n){
       print(Fabonacci(i)+" ");
       i=i+1;
    }
   
  }
  
  def Fabonacci(num:Int) :Int={
    var n:Int=0;
    n=num;
    if(n==0)
      return 0;
    if(n==1)
      return 1;
    if(n==2)
      return 1;
    
    return Fabonacci(n-1)+Fabonacci(n-2);
    
  }
}