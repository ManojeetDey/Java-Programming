class Product1{
	String Pname;
	double price;
	Product1(String n, double p)
	{
		Pname=n;
		price =p;
	}
	void showdata()
	{
		System.out.println("THe product name is "+Pname);
		System.out.println("The price of the product is "+price);
	}
}
public class Only_Parameterised_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product1 P1= new Product1();
		//the upper one is an error because the user has defined the constructor 
		//so the jvm cannot call the default constructor
		//the JVM will show the compile time error
		Product1 p2= new Product1("chocolate",150);
		p2.showdata();

	}

}
