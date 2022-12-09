
public class answer {
	
	static boolean[][] visited;
	
	public static void main(String[] args) {
		System.out.println(exist(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'},}, "ABCCED"));
	}
	
	static boolean exist(char[][] board, String word) {
		visited = new boolean[board.length][board[0].length];
		
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[i].length; j++)
				if (board[i][j] == word.charAt(0) && search(board, word, i, j, 0))
					return true;
		
		return false;
	}
	
	static boolean search(char[][] board, String word, int i, int j, int index) {
		
		if (index == word.length()) return true;
		
		if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(index) || visited[i][j])
			return false;
		
		visited[i][j] = true;
		if (search(board, word, i + 1, j, index + 1) ||
			search(board, word, i - 1, j, index + 1) ||
			search(board, word, i, j + 1, index + 1) || 
			search(board, word, i, j - 1, index + 1)) {
			return true;
		}
		
		visited[i][j] = false; 
		return false;
	}

}
