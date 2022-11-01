import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(longestSubstring("pwwkew"));
	}

	static int longestSubstring(String s) {
		int n = s.length();
		
		int res = 0;
		for(int i = 0; i < n; i++)
			for(int j = i; j < n; j++)
				if (!isRepeated(s, i, j))
					res = Math.max( res, j - i + 1);
		return res;
	}
	
	static boolean isRepeated(String s, int start, int end) {
		Set<Character> chars = new HashSet<>();
		
		for(int i = start; i <= end; i++) {
			char c = s.charAt(i);
			if (chars.contains(c)) 
				return true;
			chars.add(c);
		}
		return false;
	}
}
