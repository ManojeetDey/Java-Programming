class Student2
{
	String name;
	int roll;
	void display()
	{
		++roll;
		System.out.println("The name is "+name);
		System.out.println("The roll is "+roll);
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2();
		s1.display();
	}

}
