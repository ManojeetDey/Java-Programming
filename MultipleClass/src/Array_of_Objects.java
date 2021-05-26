import java.util.*;
class Employee1{
	String name;
	String branch;
	int id;
	
	Employee1(String n, String b, int i)
	{
		name =n;
		branch=b;
		id=i;
	}
	void display()
	{
		System.out.println("The name of the employee is "+name);
		System.out.println("The branch of the employee is "+branch);
		System.out.println("The id of the employee is "+id);
	}
	}
public class Array_of_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 []emp=new Employee1[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i< emp.length;i++)
		{
			System.out.println("Enter the information of the employee  "+(i+1));
			System.out.println("Enter the name of the employee  ");
			String name =sc.next();
			System.out.println("Enter the branch of the employee  ");
			String branch=sc.next();
			System.out.println("Enter the id of the employee  ");
			int id=sc.nextInt();
			emp[i]=new Employee1(name , branch, id);
		}
		for(int i=0;i<emp.length;i++)
		{
			emp[i].display();
		}

	}

}
