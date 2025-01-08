import java.util.*;
class CalculateSimpleInterest{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Give principle amount, rate of interest and time in years as input to calculate the simple interest");
     Float principle= sc.nextFloat();
     Float rate= sc.nextFloat();
     Float time= sc.nextFloat();
     System.out.println("simple intereset = " + ((principle*rate*time)/100));
  }
}