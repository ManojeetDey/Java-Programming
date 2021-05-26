import java.util.*;
public class Constructor1 {
	int x;
	void getdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("whats your favourite position?");
		x=sc.nextInt();
	}
	void showdata()
	{
		System.out.println("I love doing "+x);

	}
	Constructor1()
	{
		System.out.println("My Favourite position is ");
		x=69;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 obj= new Constructor1();
		obj.showdata();
		obj.getdata();
		obj.showdata();
		if(obj.x == 69)
		{
			System.out.println("you teasing me you naughty naughty!!");
		}

	}

}
