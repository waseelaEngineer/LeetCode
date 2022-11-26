
public class answer {

	public static void main(String[] args) {
		System.out.println(maxSubarray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}
	
	static int maxSubarray(int[] nums) {
		int n = nums.length;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += nums[i];
			max = Math.max(max, sum);
			
			if (sum < 0) sum = 0;
		}
		
		return max;
	}
}
