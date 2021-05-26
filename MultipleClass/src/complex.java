class complexNumber{
	int real;
	int img;
	void input(int p, int q)
	{
		real =p;
		img=q;
	}
	void calculate(complexNumber c11, complexNumber c22)//passing reference type argument
	{
		real=c11.real+c22.real;
		img=c11.img+c22.img;
	}
	void display()
	{
		System.out.println(real+" + "+img+"i");
	}
}// whenever the method is called by object reference the data members of the objects can be  accessed without using the dot operator
public class complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complexNumber c1=new complexNumber();
		complexNumber c2= new complexNumber();
		c1.input(10, 20);
		c2.input(30, 40);
		complexNumber c3=new complexNumber();
		c3.calculate(c1,c2);
		c1.display();
		c2.display();
		System.out.print("The sum of c1 and c2 is :");
		c3.display();
	}

}
