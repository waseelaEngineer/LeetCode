import java.util.Stack;

public class answer {

	public static void main(String[] args) {
		System.out.println(longestValidParentheses(")()()"));    // 4
	}
	
	static int longestValidParentheses(String s) {
		int maxlen = 0;
		for (int i = 0; i < s.length(); i++)
			for (int j = i + 2; j <= s.length(); j += 2)
				if (isValid(s.substring(i, j)))
					maxlen = Math.max(maxlen, j - i);
		return maxlen;
	}
	
	static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.push('(');
			else if (!stack.isEmpty())
				stack.pop();
			else
				return false;
		}
		return stack.isEmpty();
	}
}
