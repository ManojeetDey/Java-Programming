import java.util.*;
public class A6Q1 {

	public static int additionSimple(int x, int y)
	{
		return(x+y);
	}
	public static int subtractionSimple(int x, int y)
	{
		return (x-y);
	}
	public static double divisionSimple(int x, int y)
	{
		return(x/y);
	}
	public static int remainderSimple(int n, int m)
	{
		return(n%m);
	}
	public static double squareRootSimple(int n)
	{
		return(Math.sqrt(n));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
      int add=additionSimple(a,b);
      System.out.println(add);
      int subs=subtractionSimple(a,b);
      System.out.println(subs);
      double div=divisionSimple(a,b);
      System.out.println(div);
      int rem=remainderSimple(a,b);
      System.out.println(rem);
      double sqrt=squareRootSimple(a);
      System.out.println(sqrt);
      sc.close();
	}

}
