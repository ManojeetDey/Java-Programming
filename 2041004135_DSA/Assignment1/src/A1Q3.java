
public class A1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = { 'C', 'A', 'R', 'B', 'O', 'N' };
		int i, j, k, l, m, n, count = 0;
		for (i = 0; i < alpha.length; i++) {
			for (j = 0; j < alpha.length; j++) {
				for (k = 0; k < alpha.length; k++) {
					for (l = 0; l < alpha.length; l++) {
						for (m = 0; m < alpha.length; m++) {
							for (n = 0; n < alpha.length; n++) {
								if (i != j && i != k && i != l && i != m && i != n && j != k && j != l && j != m
										&& j != n && k != l && k != m && k != n && l != m && l != n && m != n) {
									System.out.println(""+alpha[i] + alpha[j] + alpha[k] + alpha[l] + alpha[m] + alpha[n]);

									count ++;
								}

							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}
