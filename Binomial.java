import java.util.ArrayList;
public class Binomial{
  private  ArrayList<Integer> numArr = new ArrayList<Integer>();
  private  ArrayList<Integer> newNumArr = new ArrayList<Integer>();
  
  public void myArr(){
    numArr.add(1);
    System.out.println(numArr);
    int totalRun = 5;
    while(totalRun > 0){
      pascalsNums();
      totalRun--;
    }
  }
  public void pascalsNums(){
    newNumArr.add(1);
    for(int i = 1; i < numArr.size(); i++){
      newNumArr.add(numArr.get(i-1)+numArr.get(i));
    }
    newNumArr.add(newNumArr.size(),1);
    numArr.clear();
    numArr.addAll(newNumArr);
    newNumArr.clear();
    System.out.println(numArr);
  }
}