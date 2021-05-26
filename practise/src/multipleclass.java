import java.util.*;
class circle {
	double rad;
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		rad=sc.nextDouble();
		sc.close();
	}
	void calculate()
	{
		double pi=3.141;
		System.out.println("Radius of the circle is "+rad);
		double area=pi*rad*rad;
		System.out.println(area);
				
	}
}
public class multipleclass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle ob = new circle();
		ob.getdata();
		ob.calculate();

	}

}
