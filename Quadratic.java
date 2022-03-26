public class Quadratic{
  private double decimalA;
  private double decimalB;
  private double decimalC;
  private double determinantAns=0.0;
  private double firstAns=0.0;
  public double secondAns=0.0;
  private boolean isImaginary=false;
  private String firstIm="";
  private String secondIm="";
  
  public Quadratic(){
    decimalA = 0.0;
    decimalB = 0.0;
    decimalC = 0.0;
    System.out.println(decimalA);
  }

  public Quadratic(double iniDecimalA, double iniDecimalB, double iniDecimalC){
    decimalA = iniDecimalA;
    decimalB = iniDecimalB;
    decimalC = iniDecimalC;
  }

  public double getdecimalA(){
    return decimalA;
  }

  public double getDoubleB(){
    return decimalB;
  }

  public double getDecimalC(){
    return decimalC;
  }

  public void setDecimalA(double newDecimalA){
    decimalA = newDecimalA;
  }

  public void setDecimalB(double newDecimalB){
    decimalB = newDecimalB;
  }

  public void setDecimalC(double newDecimalC){
    decimalC = newDecimalC;
  }

  public void determinant(){
   double determinantVal =  ((decimalB*decimalB) - (4*decimalA*decimalC));
   if(determinantVal < 0){    
     determinantAns = Math.sqrt(Math.abs(determinantVal));
     isImaginary = true; 
   }else{
    determinantAns = Math.sqrt(determinantVal);
   }
  }

  public double getDeterminant(){
    return determinantAns;
  }

  public void answer(){
    determinant();
    if(isImaginary){
      firstIm = ((0-decimalB)/(2*decimalA) + " + " + String.format("%.4f", (determinantAns / (2*decimalA))) + " i");
      secondIm = ((0-decimalB)/(2*decimalA) + " - " + String.format("%.4f", (determinantAns / (2*decimalA))) + " i");
    }else {
      firstAns = (0-decimalB+determinantAns)/(2*decimalA);
      secondAns = (0-decimalB-determinantAns)/(2*decimalA); 
    }
  }
  
// sqrt symbol = \u221A
  
  public String toString(){
    answer();
    String returnVal = "";
    if( isImaginary){
      returnVal = "First Answer: " +  firstIm + "   Second Answer: " + secondIm;
    } else{
      returnVal = "First Answer: " +  firstAns + "   Second Answer: " + secondAns;
    }
    return returnVal;
  }

  public String factoredForm(){
    String firstFactor = "";
    String secondFactor = "";
    if(firstAns < 0){
      firstFactor = "(X + " + firstAns*-1 + ")";
    } else{
      firstFactor = "(X - " + firstAns + ")";
    }
    if(secondAns < 0){
      secondFactor = "(X + " + secondAns*-1 + ")";
    } else{
      secondFactor = "(X - " + secondAns + ")";
    }
    
    if(isImaginary){
      return "The answers are imaginary, I dont currently have a factored form for imaginary numbers";
      //imaginaryFactoredForm();
    }else{
      return firstFactor + secondFactor;
    }
    
  }
  public String imaginaryFacoredForm(){
    return null;
  }
  
}