import java.util.*;

public class A1Q1 {
	int a, b, c;

	public  void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	}

	public  void IsArithematicOrder() {
		if ((a + b == c) || (b - c == a) || (a * b == c))
			System.out.println(a + "," + b + "," + c + " can be used in the arithematic formula");
		else
			System.out.println(a + "," + b + "," + c + " cannot be used in the arithematic formula");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1Q1 ob = new A1Q1();
		ob.getdata();
		ob.IsArithematicOrder();

	}
}

