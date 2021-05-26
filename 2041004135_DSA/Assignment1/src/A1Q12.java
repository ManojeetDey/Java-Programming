import java.util.*;

class Flower {
	String name;
	int petals;
	float price;

	Flower() {
		name = "Rose";
		petals = 5;
		price = 20;
	}

	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("The name of flower");
		name = sc.next();
		System.out.println("Enter the number of petals of flower");
		petals = sc.nextInt();
		System.out.println("Enter the price of flower");
		price = sc.nextFloat();
	}

	void showdata() {
		System.out.println("The name of the flower is " + name);
		System.out.println("The number of petals of the flower is " + petals);
		System.out.println("The price of the flower is " + price);

	}
}

public class A1Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower obj = new Flower();
		obj.showdata();
		Flower obj1 = new Flower();
		obj1.getdata();
		obj1.showdata();
	}

}
