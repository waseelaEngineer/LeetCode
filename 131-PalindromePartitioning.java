// time = O(n*2^n)
// space = O(n*n)

import java.util.ArrayList;
import java.util.List;

public class solution {

	public static void main(String[] args) {
		System.out.println(partition("aab"));
	}
	
	static List<List<String>> partition(String s){
		int len = s.length();
		boolean[][] dp = new boolean[len][len];
		List<List<String>> result = new ArrayList<>();
		dfs(result, s, 0, dp, new ArrayList<>());
		return result;
	}
	
	static void dfs(List<List<String>> result, String s, int start, boolean[][] dp, List<String> currList) {
		if (start >= s.length()) result.add(new ArrayList<>(currList));
		for (int end = start; end < s.length(); end++) {
			if (s.charAt(start) == s.charAt(end) && (end - start <= 2 || dp[start + 1][end - 1])) {
				dp[start][end] = true;
				currList.add(s.substring(start, end + 1));
				dfs(result, s, end + 1, dp, currList);
				currList.remove(currList.size() -  1);
			}
		}
	}
}
