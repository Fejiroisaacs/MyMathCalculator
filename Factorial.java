//author name - fejiro 
import java.math.*;
public class Factorial{
  private long n;
  private long r;
  private double ans;

  public Factorial(long iniN, long iniR){
     n = iniN;
     r = iniR;
     ans = 0.0;
    
  }
  
  public static long facVal(long val){
    long i = val -1;
    if(val == 0){
      val = 1;
    } else {
      while(i > 0){
        val *= i;i--;
      }
    }
  
    return val;
  }
  public double permutation(){
    double retVal = 0.0;
    long low = n-r;
    if(n == r){
      retVal = facVal(n);
    } else if(n > r){
      retVal = facVal(n)/facVal(low);
    }else{
      retVal = 0.0;
    }
    
    return retVal;
  }
  public double combination(){
    double result2 = 1.0;
    long o = n-r;
    if(n >= r){
      result2 = (facVal(n))/(facVal(o)*facVal(r));
    }else{
      result2 = 0.0;
      System.out.println("The answer below (0.0) is incorrect, please ensure your r value is less than n");
    }
    return result2;
  }
  
}