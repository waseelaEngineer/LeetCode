import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class solution {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("leet");
		list.add("code");
		System.out.println(wordBreak("leetcode", list));
	}
	
	static boolean wordBreak(String s, List<String> wordDict) {
		Set<String> wordDictSet = new HashSet<>(wordDict);
		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		
		for (int i = 1; i <= s.length(); i++)
			for (int j = 0; j < i; j++)
				if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
		
		return dp[s.length()];
	}
}
