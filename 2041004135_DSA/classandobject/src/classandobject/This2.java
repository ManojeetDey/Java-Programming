package classandobject;

import java.util.*;

public class This2 {
	int num1;

	void input(int num1) {
		this.num1 = num1;
	}

	void display() {
		System.out.println("Value of number= " + num1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This2 ob = new This2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		ob.input(n);
		ob.display();
	}

}
