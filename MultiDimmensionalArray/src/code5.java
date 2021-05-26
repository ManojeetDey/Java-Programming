import java.util.*;
public class code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of students and number of subjects");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]= new int [m+1][n+1];
		System.out.println("Enter the elements ");
		int i,j;
		for( i=0;i<m;i++)
		{
			for( j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for( i=0;i<m;i++)
		{
			int sum=0;
			for( j=0;j<n;j++)
			{
				sum+=a[i][j];
			}
			a[i][n]=(int)(Math.round(sum)/n);			
		}
		for( i=0;i<m;i++)
		{
			int sum=0;
			for( j=0;j<n;j++)
			{
				sum+=a[j][i];
			}
			a[m][j]=(int)(Math.round(sum)/n);			
		}
		for( i=0;i<=m;i++)
		{
			for(j=0;j<=n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
