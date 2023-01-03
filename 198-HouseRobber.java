
public class solution {

	public static void main(String[] args) {
		System.out.println(rob(new int[] {1,2,3,1}));
	}
	
	static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
	}

}
