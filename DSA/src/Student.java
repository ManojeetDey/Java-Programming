import java.util.*;
public class Student {
String name;
int roll;
double CGPA;
String branch;
void getData()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name ");
	name=sc.nextLine();
	System.out.println("Enter the roll");
	roll=sc.nextInt();
	System.out.println("CGPA");
	CGPA=sc.nextDouble();
	sc.nextLine();
	System.out.println("Branch");
	branch=sc.nextLine();
}
void display()
{
	System.out.println("Name is "+name);
	System.out.println("Roll Number "+roll);
	System.out.println("CGPA "+CGPA);
	System.out.println("Branch "+branch);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.getData();
		s1.display();
		
	}

}
