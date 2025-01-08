import java.util.*;
class AreaOfACircle{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Give radius as input to calculate the area of a circle");
     Float radius= sc.nextFloat();
     System.out.println("Area of circle = " + (Math.PI*radius*radius));
  }
}