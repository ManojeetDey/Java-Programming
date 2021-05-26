package Interface;
interface printable{
	void print();
}
public class interface1 implements printable {
public void print()
{
	System.out.println("This is printing");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printable ob= new interface1();
		ob.print();
	}

}
