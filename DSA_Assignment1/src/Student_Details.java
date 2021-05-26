import java.util.*;

class Student {
	String name;
	int roll;
	double mark;

	void setdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the roll:");
		roll = sc.nextInt();
		System.out.println("Enter the marks:");
		mark = sc.nextDouble();
	}

	void display() {
		System.out.println("The name is " + name);
		System.out.println("The roll number is " + roll);
		System.out.println("The mark is " + mark);
	}
}

public class Student_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setdata();
		s1.display();
		Student s2 = new Student();
		s2.setdata();
		s2.display();
		Student s3 = new Student();
		s3.setdata();
		s3.display();
	}

}
