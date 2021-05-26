import java.util.*;
public class code6 {

	public static double [][] getMatrix()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns");
		int col= sc.nextInt();
		System.out.println("Enter the elements of the matrix");
		double[][] m=new double[row][col];
		for(int i=0;i<row;i++)
		for(int j=0;j<col;j++)
		m[i][j]=sc.nextDouble();
		return m;
	}
	public static void display(double[][] M)
	{
		for(int i=0;i<M.length;i++)
		{
			for(int j=0;j<M[0].length;j++)
				System.out.print(M[i][j]+" ");
			System.out.println();
		}
	}
	public static double [][] addMatrix(double [][] a, double [][]b)
	{
		double[][] m= new double [a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
				m[i][j]=a[i][j]+b[i][j];
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] mat1=getMatrix();
		double [][] mat2=getMatrix();
		System.out.println("Elements of the 1st matrix are");
		display(mat1);
		System.out.println("Elements of the 2nd matrix are");
		display(mat2);
		if(mat1.length==mat2.length && mat1[0].length==mat2[0].length)
		{
			double [][]res=addMatrix(mat1,mat2);
			System.out.println("Elements of the matrix after addition");
			display(res);
		}
		else
		{
			System.out.println("Matrix addition is not possible due to different dimmensions");
		}
		
	}

}
