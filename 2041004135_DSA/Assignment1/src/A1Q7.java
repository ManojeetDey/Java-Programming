import java.util.*;

public class A1Q7 {
	public static int[] getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int mat[] = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			mat[i] = sc.nextInt();
		}
		return mat;
	}

	public static void OddProductPair(int mat[]) {
		for (int i = 0; i < mat.length; i++) {
			int m;
			for (int j = i+1; j < mat.length; j++) {
				m = mat[i] * mat[j];
				if (m % 2 == 1) 
					System.out.println(mat[i] + " " + mat[j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[] = getdata();
		OddProductPair(mat);

	}

}
