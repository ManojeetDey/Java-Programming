import java.util.*;

class Student1
{
	String name;
	int roll;
	double mark;
	
	void setData(String n,int r,double m)
	{
		name=n;
		roll=r;
		mark=m;
	}
	void display() {
		System.out.println("The name is " + name);
		System.out.println("The roll number is " + roll);
		System.out.println("The mark is " + mark);
	}
}
public class A1Q10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name:");
		String n=sc.next();
		System.out.println("Enter the roll:");
		int r=sc.nextInt();
		System.out.println("Enter the marks:");
		double m=sc.nextDouble();
		Student1 s1=new Student1();
		s1.setData(n, r, m);
		s1.display();
	}

}
