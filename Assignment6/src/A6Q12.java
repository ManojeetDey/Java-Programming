import java.util.*;
public class A6Q12 {
public static int count(String str)
{
	int c=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			c++;
	}
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str= sc.next();
		System.out.println("The number of vowels in "+str+" is "+(count(str)));
		sc.close();

	}

}
