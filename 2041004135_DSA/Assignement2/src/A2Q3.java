import java.util.*;

class Student {
	int roll;
	String name;
	String course;

	void input_Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll of the student");
		roll = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of the student");
		name = sc.next();
		System.out.println("Enter the course of the student");
		course = sc.next();
	}

	void display_Student() {
		System.out.println("THe name of the student is " + name);
		System.out.println("THe roll of the student is " + roll);
		System.out.println("The course of the student is " + course);
	}
}

class Exam extends Student {
	double mark1, mark2, mark3;

	void input_marks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in subject1 ");
		mark1 = sc.nextDouble();
		System.out.println("Enter the marks in subject2 ");
		mark2 = sc.nextDouble();
		System.out.println("Enter the marks in subject3 ");
		mark3 = sc.nextDouble();
	}

	void display_Result() {
		System.out.println("The marks in subject1 " + mark1);
		System.out.println("The marks in subject1 " + mark2);
		System.out.println("The marks in subject1 " + mark3);

	}

}

public class A2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam[] arr = new Exam[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Exam();
			arr[i].input_Student();
			arr[i].input_marks();
			arr[i].display_Student();
			arr[i].display_Result();

		}
	}

}
