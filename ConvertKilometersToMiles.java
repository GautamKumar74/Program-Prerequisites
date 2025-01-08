import java.util.*;
class ConvertKilometersToMiles{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Give kilometers as input to convert it to miles");
     float km= sc.nextFloat();
     System.out.println("miles = " + km*0.621371);
  }
}