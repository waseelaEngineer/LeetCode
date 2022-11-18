
public class answer {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1,3,5,6}, 2));
	}
	
	static int searchInsert(int[] nums, int target) {
		
		int start = 0, end = nums.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if (target < nums[mid])
				end = mid - 1;
			
			else if (target > nums[mid])
				start = mid + 1; 
			
			else
				return mid;
		}
		return start;
	}
}