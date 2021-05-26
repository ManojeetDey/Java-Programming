import java.util.Scanner;

class Complex {
	int real, imag;

	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real number");
		real = sc.nextInt();
		System.out.println("Enter the imaginary number");
		imag = sc.nextInt();
	}

	void display() {
		System.out.println("The complex number is " + real + " + " + imag + "i");
	}

	public Complex add(Complex c1, Complex c2) {
		Complex c3 = new Complex();
		c3.real = c1.real + c2.real;
		c3.imag = c1.imag + c2.imag;
		return c3;
	}
}

public class A2Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex ob1 = new Complex();
		Complex ob2 = new Complex();
		ob1.setData();
		ob2.setData();
		Complex ob = ob1.add(ob1, ob2);
		System.out.println("After Addition");
		ob.display();
	}
}
