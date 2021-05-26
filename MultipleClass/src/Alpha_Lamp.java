class lamp
{
	boolean switch1;
	void input(boolean p)
	{
		switch1=p;
	}
	void display() {
		if(switch1==true)
		{
			System.out.println("Light is on");
		}
		else
			System.out.println("Light is off");
	}
}
public class Alpha_Lamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lamp l1=new lamp();
		l1.input(false);
		l1.display();
		lamp l2=new lamp();
		l2.input(true);
		l2.display();
	}

}
