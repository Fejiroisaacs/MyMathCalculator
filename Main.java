import java.util.Scanner;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Binomial.myArr();    
    Scanner sam = new Scanner(System.in);
    int userChoice = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    long n = 0;
    long r = 0;
    long facNum = 0;
    
    System.out.println("Welcome to my wonderful calculator, I currently have four options.\n 1. Quadratic calculator. \n 2. Permutation Calculator. \n 3. Combination Calculator. \n 4. Factorial Calculator.");
    
    while(userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4){
      System.out.println("PLease select a choice.");
      if(userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4){
        userChoice = isValidNum(sam);
        System.out.println(userChoice);
      }
    }
    System.out.println("Option " + userChoice + " was selected");
    if(userChoice == 1){
      System.out.println("Here, you would input the values of A, B and C from the general quadratic form of AX² + BX + C = 0");
      System.out.print("Enter a value for A: ");
      a = isValidNum(sam);
      System.out.print("Enter a value for B: ");
      b = isValidNum(sam);
      System.out.print("Enter a value for C: ");
      c = isValidNum(sam);
      Quadratic q1 = new Quadratic(a,b,c);
      System.out.println(q1.toString());
      System.out.println(q1.factoredForm());
    }else if(userChoice == 2){
      System.out.println("Here, you would input the values of n and r from ⁿPᵣ");
      System.out.print("Enter a value for n: ");
      n = isValidNum(sam);
      System.out.print("Enter a value for r: ");
      r = isValidNum(sam);
      Factorial f1 = new Factorial(BigInteger.valueOf(n), BigInteger.valueOf(r));
      System.out.println(f1.permutation());
    }else if(userChoice == 3){
      System.out.println("Here, you would input the values of n and r from ⁿCᵣ");
      System.out.print("Enter a value for n: ");
      n = isValidNum(sam);
      System.out.print("Enter a value for r: ");
      r = isValidNum(sam);
      Factorial f1 = new Factorial(BigInteger.valueOf(n), BigInteger.valueOf(r));
      System.out.println(f1.combination());
    }else if(userChoice == 4){
      System.out.println("Here, you would input a number you wish to factorial. \nIn mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n. ");
      System.out.print("Enter the number you wish to factorial: ");
      facNum = isValidNum(sam);
      System.out.println(Factorial.facVal(BigInteger.valueOf(facNum)));
    }else{
      System.out.println("This cannot possibly be an option. You broke my code. WHY???????????????????????????????????");
    }
    
    
    /**Quadratic q1 = new Quadratic(1,8,427);
    System.out.println(q1.toString());
    System.out.println(q1.factoredForm());
    Factorial f1 = new Factorial(10, 4);
    System.out.println(f1.combination());
    System.out.println(f1.permutation()); */
  }

  public static int isValidNum(Scanner sam){
    while(!sam.hasNextInt()){
      System.out.println("Please enter a number");
      sam.next();
    }
    return sam.nextInt();
  }
  
}