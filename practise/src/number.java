
public class number {
	public static void main(String args[])
	{
		int x='B';
		switch(x)
		{
		
		case 65: x+=5;
		case 97: x+=10; break;
		case 98: x+=15;
		break;
		case 55: x+=20;
		default: x+= 10;
		}
		System.out.println(x);
		
	}

}
