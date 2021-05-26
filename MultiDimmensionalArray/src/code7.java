import java.util.*;
public class code7 {
public static double[][] getMatrix()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows");
	int row= sc.nextInt();
	System.out.println("Enter the number of columns");
	int col= sc.nextInt();
	System.out.println("Enter the elements of a "+row+" by "+col+" matrix");
	double[][] m= new double[row][col];
	for(int i=0;i<row;i++)
	for(int j=0;j<col;j++)
		m[i][j]=sc.nextDouble();
	sc.close(); return m;
}
public static void display(double a[][])
		{
	for(int i=0;i<a.length;i++)
	{
	  for(int j=0;j<a[i].length;j++)
	  {
		  System.out.print(a[i][j]+" ");
	  }
	  System.out.println();
	}
		}
public static double[][] transposematrix(double a[][])
{
	double temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<i;j++)
		{
			temp=a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
		}
	}
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mat1[][]=getMatrix();
		System.out.println("The original matrix");
		display(mat1);
		mat1=transposematrix(mat1);
		System.out.println("The transpose matrix");
		display(mat1);
	}

}
