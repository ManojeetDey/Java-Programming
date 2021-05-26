import java.util.*;
public class code8 {
	public static boolean isPrime(int a)
	{
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
				return false;
		}
		return true;
	}
 public static boolean[][] getMatrix()
{
	 Scanner sc= new Scanner (System.in);
	 System.out.println("Enter the size of the array: ");
	 int n=sc.nextInt();
	 boolean[][] a=new boolean[n][n];
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<n;j++)
		 {
			 if(isPrime(i) && isPrime(j))
			 {
				 a[i][j]=true;
			 }
			 else 
				 a[i][j]=false;
		 }
	 }
	 return a;
}
 public static void displayMatrix(boolean a[][])
 {
	 System.out.println("The Matrix is ");
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[i].length;j++)
		 {
			 System.out.print(a[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a[][]=getMatrix();
		displayMatrix(a);

	}

}
