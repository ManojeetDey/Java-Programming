import java.util.*;
public class A6Q13 {
public static boolean Palindrome(String str)
{
	String s1="";
	for(int i=str.length()-1;i>=0;i--)
	{
		s1+=str.charAt(i);
	}
	if(str.compareTo(s1)==0)
		return true;
	else
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word:");
		String str= sc.next();
		if(Palindrome(str)==true)
		System.out.println("The word is palindrome");
		else
			System.out.println("The word is not palindrome");
		sc.close();
	}

}
