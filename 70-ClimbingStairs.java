
public class answer {

	public static void main(String[] args) {
		System.out.println(climbStairs(4));
	}
	
	static int climbStairs(int n) {
		if (n <= 0) return 0;
		if (n == 1) return 1;
		if (n == 2) return 2;
		
		int two_steps_back = 1;
		int one_step_back = 2;
		int all_steps = 0;
		
		for (int i = 2; i < n; i++) {
			all_steps = two_steps_back + one_step_back;
			two_steps_back = one_step_back;
			one_step_back = all_steps;
		}
		return all_steps;
	}
}
