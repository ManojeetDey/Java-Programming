import java.util.*;
public class A6Q11 {
	public static int count(String str, char a)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==a)
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String and the character:");
		String str=sc.next();
		char a=sc.next().charAt(0);
		System.out.println("The number od times "+a+" has ocuured in "+str+" is "+count(str,a));
		sc.close();
	}

}
