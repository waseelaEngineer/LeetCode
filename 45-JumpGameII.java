
public class answer {

	public static void main(String[] args) {
		System.out.println(jump(new int[] {2,3,1,1,4}));
	}
	
	static int jump(int[] nums) {
		
		int jumps = 0, stop = 0, max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			max = Math.max(max, i + nums[i]);
			if (i == stop) {
				jumps++;
				stop = max;
			}
		}
		return jumps;
	}
}
