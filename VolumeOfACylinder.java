import java.util.*;
class VolumeOfACylinder{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Give radius and height as input to calculate the volume of a Cylinder");
     Float radius= sc.nextFloat();
     Float height= sc.nextFloat();
     System.out.println("Volume of Cylinder = " + (Math.PI*radius*radius*height));
  }
}