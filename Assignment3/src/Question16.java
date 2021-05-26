import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks ");
		int m=sc.nextInt();
		int m1=m/10;
		char c = 0;
		switch(m1)
		{
			case 0:
			case 1:
			case 2:
			case 3:
				c='F';
				break;
			case 4:
				c='E';
				break;
			case 5:
				c='D';
				break;
			case 6:
				c='C';
				break;
			case 7:
				c='B';
				break;
			case 8:
				c='A';
				break;
			case 9:
				c='O';
				break;
			case 10:
				if(m==100)
				{
				c='O';
				break;
				}
				else
					System.out.println("invalid input");
				break;
				default:
					System.out.println("invalid input");
		}
		System.out.println("Student has got grade "+c);
		sc.close();

	}

}
