import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius and length of a cylinder: ");
      double radius= sc.nextDouble();
      double length=sc.nextDouble();
      double area =3.14 * radius * radius;
      double volume = area * length;
      System.out.println(volume);
      sc.close();
      
}

}
