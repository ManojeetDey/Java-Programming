class comp{
	int real;
	int img;
	void input(int p,int q)
	{
		real=p;
		img=q;
	}
	void calculate(comp c11,comp c22)
	{
		real=c11.real+c22.real;
		img=c11.img+c22.img;
	}
	void display() {
		System.out.println(real+"+i"+img);
	}
}
public class alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comp c1=new comp();
		comp c2= new comp();
		c1.input(10,20);
		c2.input(30, 40);
		comp c3= new comp();
		c3.calculate(c1, c2);
		c1.display();
		c2.display();
		System.out.println("the sum of c1 and c2 is ");
		c3.display();
	}

}
