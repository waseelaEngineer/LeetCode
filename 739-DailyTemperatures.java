// Time: O(n)
// Space: O(1)
import java.util.Stack;

public class solution {

	public static void main(String[] args) {
		int[] daysToWait = dailyTemperatures(new int[] {73,74,75,71,69,72,76,73});
	}
	
	static int[] dailyTemperatures(int[] temperatures) {
		Stack<Integer> stack = new Stack<>();
		int[] ans = new int[temperatures.length];
		for(int i = 0; i < temperatures.length; i++) {
			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int idx = stack.pop();
				ans[idx] = i - idx;
			}
			stack.push(i);
		}
		return ans;
	}

}