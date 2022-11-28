
public class answer {

	public static void main(String[] args) {
		System.out.println(canJump(new int[] {3,2,1,0,4}));
	}
	
	static boolean canJump(int[] nums) {
		if (nums.length < 2) return true;
		
		for (int curr = nums.length - 2; curr >= 0; curr--) {
			if (nums[curr] == 0) {
				int neededJump = 1;
				while(neededJump > nums[curr]) {
					neededJump++;
					curr--;
					if (curr < 0) return false;
				}
			}
		}
		return true;
	}
}
