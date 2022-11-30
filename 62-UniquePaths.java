
public class answer {

	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 7));
	}

	static int uniquePaths(int m, int n) {
		if (m == 1 || n == 1) return 1;
		m--;
		n--;
		if (m < n) {	// swap, so that m is bigger number
			m = m + n;
			n = m - n;
			m = m - n;
		}
		int res = 1, j = 1;
		for (int i = m + 1; i <= m + n; i++ , j++) {   // Instead of taking factorial, keep on multiply & divide
			res *= i;
			res /= j;
		}
		return res;
	}
}