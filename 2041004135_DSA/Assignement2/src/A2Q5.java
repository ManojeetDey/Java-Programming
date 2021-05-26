import java.util.*;
class Person
{
	String name;
	int age;
	Person(int a,String n)
	{
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println("name ="+name);
		System.out.println("Age "+age);
	}
}
class Student3 extends Person
{
	int marks, roll;
	String course;
	Student3(String n,int a, int m, int r, String c)
	{
		super(a,n);
		marks=m;
		roll=r;
		course=c;
	}
	void display()
	{
		super.display();
		System.out.println("roll: "+roll);
		System.out.println("course "+course);
		System.out.println("marks "+marks);
	}
}
class Teacher extends Person{
	int contact_hour;
	String sub_assigned;
	Teacher(String n, int a,String s,int w)
	{
		super(a,n);
		contact_hour=w;
		sub_assigned=s;
	}
	void display()
	{
		super.display();
		System.out.println("Subjects assigned: "+sub_assigned);
		System.out.println("Contact hour: "+contact_hour);
	}
}
public class A2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the student name ");
		String n=sc.next();
		System.out.println("Enter the age of the student");
		int a=sc.nextInt();
		System.out.println();
		

	}

}
