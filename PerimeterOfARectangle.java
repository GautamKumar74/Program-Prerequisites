import java.util.*;
class PerimeterOfARectangle{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Give length and width as input to calculate the perimeter of a rectangle");
     Float length= sc.nextFloat();
     Float width= sc.nextFloat();
     System.out.println("Perimeter of a rectangle = " + (2*(length+width)));
  }
}