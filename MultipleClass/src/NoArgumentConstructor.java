import java.util.*;
class person{
	String name;
	int roll;
	double height;
	person()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the nme ");
		name =sc.next();
		System.out.println("ENer the roll number:");
		roll=sc.nextInt();
		System.out.println("ENter the height:");
		height=sc.nextDouble();
	}
	void display()
	{
		System.out.println("The name  is "+name);
		System.out.println("The roll number is "+roll);
		System.out.println("The height is "+height);
	}
}
public class NoArgumentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1=new person();
		p1.display();
		person p2=new person();
		p2.display();

	}

}
