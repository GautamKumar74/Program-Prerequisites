import java.util.*;
class PowerCalculation{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Give base and exponent as input to calculate the power as base raised to the exponent");
     double base= sc.nextDouble();
     double exponent= sc.nextDouble();
     System.out.println("Power = " + (Math.pow(base,exponent)));
  }
}