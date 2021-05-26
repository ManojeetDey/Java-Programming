import java.util.*;
interface Counts{
	void display();
	void count();
}
class Person4 implements Counts{
	static int max_count=0;
	String name;
	public void display()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("The name of the person is "+name);
		count();
	}
	public void count()
	{
		for(int i=0;i<name.length();i++)
		{
			max_count++;
		}
		System.out.println("The number of the characters in the name is "+max_count);
	}
}
public class A2Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counts obj= new Person4();
		obj.display();
	}

}
