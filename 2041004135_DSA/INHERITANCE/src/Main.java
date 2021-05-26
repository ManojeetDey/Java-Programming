class Base{
	int x;
	Base(int _x)
	{
		x=_x;
	}
}
class Derived extends Base{
	int y;
	Derived(int _y,int _x)
	{
		super(_x);
		y=_y;
	}
	void display()
	{
		System.out.println("x= "+x+", y= "+y);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived ob= new Derived(10,20);
		ob.display();
	}

}
