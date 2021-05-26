import java.util.*;
class Student4
{
	String name;
	int roll;
	static String branch;
	Student4(String n,int r)
	{
		name =n;
		roll=r;
	}
	void display()
	{
		System.out.println("The name of the student is "+name);
		System.out.println("The branch of the student is "+branch);
		System.out.println("The roll of the student is "+roll);
	}
}
public class Static_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Student4 ob[]= new Student4[3];
		for(int i=0;i<ob.length;i++)
		{
		System.out.println("ENter the informations of student "+i+1);
		System.out.println("Enter the name of the student: ");
		String name=sc.next();
		System.out.println("Enter the roll of the student:");
		int roll=sc.nextInt();
		Student4.branch="CSE";
		ob[i]=new Student4(name ,roll);
		}
		for(int i=0;i<ob.length;i++)
		{
			ob[i].display();
		}
	}

}
