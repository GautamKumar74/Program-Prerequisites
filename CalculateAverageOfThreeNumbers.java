import java.util.*;
class CalculateAverageOfThreeNumbers{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Give three numbers as input to calculate the average of these numbers");
     float one= sc.nextFloat();
     float two= sc.nextFloat();
     float three= sc.nextFloat();
     System.out.println("Average = " + (one+two+three)/3);
  }
}