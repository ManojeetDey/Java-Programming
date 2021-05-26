package classandobject;
class operation {
	int square(int n) {
		return n * n;
	}
}

public class Aggregation {
	operation op;// Aggregation concept
	double pi = 3.14;

	double area(int radius) {
		op = new operation();
		int rsquare = op.square(radius);
		return pi * rsquare;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation ob = new Aggregation();
		double result = ob.area(5);
		System.out.println(result);
	}

}
