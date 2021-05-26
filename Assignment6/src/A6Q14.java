import java.util.*;
public class A6Q14 {

	public static void password(String str)
	{
		int d=0;
		if(str.length()<8)
		System.out.println("Invalid password");
		else
		{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
				d++;
			if((str.charAt(i)<97&&str.charAt(i)>122)||(str.charAt(i)<65&&str.charAt(i)>90)||(str.charAt(i)<48&&str.charAt(i)>57))
			{
				System.out.println("Invalid password");
				break;
			}
		}
		if(d<2)
			System.out.println("Invalid password");
		else
			System.out.println("Valid password");
	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the password:");
		String str= sc.next();
		password(str);
		sc.close();

	}

}
