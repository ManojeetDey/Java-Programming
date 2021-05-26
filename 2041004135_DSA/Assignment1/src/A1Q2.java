import java.util.*;

class number {
	int n;

	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		if (n < 2)
			System.exit(0);
	}

	void times() {
		int c = 0;
		while (n > 2) {
			n = n / 2;
			c++;
		}
		System.out.println("The number of times we need to divide the number by 2= " + c);

	}

}

public class A1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number ob = new number();
		ob.getData();
		ob.times();

	}

}
