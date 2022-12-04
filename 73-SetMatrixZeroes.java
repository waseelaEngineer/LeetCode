
public class answer {

	public static void main(String[] args) {
		int[][] m = new int[][] {{1, 1, 1},{1, 0, 1},{1, 1, 1}};
		setZeroes(m);
	}
	
	static void setZeroes(int[][] matrix) {
		int R = matrix.length;
		int C = matrix[0].length;
		boolean isCol = false;
		
		// If an element is zero, we set the first element of the corresponding row and column to 0
		for (int i = 0; i < R; i++) {
			
			if (matrix[i][0] == 0)
				isCol = true;
			
			for (int j = 1; j < C; j++)
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
		}
		
		// Iterate over the array once again and using the first row and first column, update the elements.
		for (int i = 1; i < R; i++)
			for (int j = 1; j < C; j++)
				if (matrix[i][0] == 0 || matrix[0][j] == 0)
					matrix[i][j] = 0;
		
		// See if the first row needs to be set to zero as well
		if (matrix[0][0] == 0)
			for (int j = 1; j < C; j++)
				matrix[0][j] = 0;
		
		// See if the first column needs to be set to zero as well
		if (isCol)
			for (int i = 0; i < R; i++)
				matrix[i][0] = 0;
		
	}
	// time O(m x n)
	// space O(1)
}
