// Time: O(n)
// Space: O(1)
public class solution {

	public static void main(String[] args) {
		int[] res = new int[] {0,1,0,3,12};
		moveZeroes(res);
	}
	
	static void moveZeroes(int[] nums) {
		int lastNonZeroFoundAt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[lastNonZeroFoundAt];
				nums[lastNonZeroFoundAt++] = nums[i];
				nums[i] = temp;
			}
		}
	}
}
