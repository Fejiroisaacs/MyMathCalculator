import java.math.*;
public class Factorial{
  private BigInteger n = new BigInteger("0");
  private BigInteger r = new BigInteger("0");

  public Factorial(BigInteger iniN, BigInteger iniR){
    if(iniR.compareTo(iniN) == 1){
      System.out.println("please enter n ≥ r ≥ 0");
    }
    n = iniN;
    r = iniR;
  }
  public static BigInteger facVal(BigInteger val){
    BigInteger retVal = val;
    if(val.intValue() == 0){
      retVal = new BigInteger("1");
    }else{
      for(int i = 1; i < val.intValue(); i++){
        retVal = retVal.multiply(BigInteger.valueOf(i));
      }
    } 
    return retVal;
  }

  public BigInteger permutation(){
    return facVal(n).divide(facVal(n.subtract(r)));
    //returns the the value of ⁿPᵣ using the formula n!/(n-r)!
  }
  public BigInteger combination(){
    return facVal(n).divide((facVal(n.subtract(r)).multiply(facVal(r))));
    //returns the the value of ⁿCᵣ using the formula n!/(r!(n-r)!)
  }
}