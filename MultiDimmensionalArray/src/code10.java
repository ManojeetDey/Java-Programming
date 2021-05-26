
public class code10 {
	public static int[][] generateArray(int matrix[][]) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		return matrix;
	}

	public static void displayMatrix(int matrix[][]) {
		System.out.println("The Matrix :");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void findIndex(int m[][]) {
		int maxRowIndex = 0;
		int max = 0;
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				maxRowIndex = i;
			}
		}
		int maxColumnIndex = 0;
		int maxcol = 0;
		for (int col = 0; col < m[0].length; col++) {
			int count = 0;
			for (int row = 0; row < m.length; row++) {
				if (m[row][col] == 1)
					count++;
			}
			if (count > max) {
				maxcol = count;
				maxColumnIndex = col;
			}
		}
		System.out.println("Max row : " + maxRowIndex);
		System.out.println("Max column : " + maxColumnIndex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[4][4];
		generateArray(m);
		displayMatrix(m);
		findIndex(m);

	}

}
