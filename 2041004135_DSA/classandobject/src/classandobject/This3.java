package classandobject;
import java.util.*;
public class This3 {
	int num1 , num2;
	void getdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
	}
	void display()
	{
		System.out.println("Value of the 1st number "+num1);
		System.out.println("value of the 2nd number "+num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This3 obj= new This3();
		obj.getdata();
		obj.display();
	}

}
