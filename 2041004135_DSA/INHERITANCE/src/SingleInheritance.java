class operation1 {
	void addition(int a, int b) {
		System.out.println("Addition of two numbers " + (a + b));
	}
}

class operation2 extends operation1 {
	void substraction(int a, int b) {
		System.out.println("Substraction of two numbers " + (a - b));
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation2 o = new operation2();
		o.addition(20, 5);
		o.substraction(30, 8);

	}

}
