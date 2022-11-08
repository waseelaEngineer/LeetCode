import java.util.Stack;

public class answer {

	public static void main(String[] args) {
		System.out.println(isValid("(){}[]"));
	}
	
	static boolean isValid(String s) {
		if (s.length() % 2 != 0) return false;
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
}