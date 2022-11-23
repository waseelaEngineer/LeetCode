
public class answer {

	public static void main(String[] args) {
		int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(m);    // {{7,4,1},{8,5,2},{9,6,3}}
	}
	
	static void rotate(int[][] m) {
		int n = m.length;
		for (int i = 0; i < (n + 1) / 2; i++)
			for (int j = 0; j < n / 2; j++) {
				int temp = m[n - 1 - j][i];
				m[n - 1 - j][i] = m[n - 1 - i][n - 1 - j];
				m[n - 1 - i][n - 1 - j] = m[j][n - 1 - i];
				m[j][n - 1 - i] = m[i][j];
				m[i][j] = temp;
			}
	}
}
