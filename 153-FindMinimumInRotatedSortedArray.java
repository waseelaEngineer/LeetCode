
public class solution {

	public static void main(String[] args) {
		System.out.println(findMin(new int[] {3, 4, 5, 1, 2}));
	}
	
	static int findMin(int[] nums) {
		int left = 0, right = nums.length - 1;
		
		if (nums[right] > nums[0] || nums.length == 0) return nums[0];
		
		while (left <= right) {
			
			int mid = left + (right - left) / 2;
			
			if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
			
			if (nums[mid] < nums[mid - 1]) return nums[mid];
			
			if (nums[mid] > nums[left]) left = mid + 1;
			
			else right = mid - 1;
		}
		return Integer.MAX_VALUE;
	}
}
