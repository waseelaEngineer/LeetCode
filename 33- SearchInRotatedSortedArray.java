
public class answer {

	public static void main(String[] args) {		
		System.out.println(search( new int[] {4,5,6,7,0,1,2}, 0));    // 4
	}
	
	static int search(int[] nums, int target) {
		if (nums.length == 0) return -1;
		
		int start = 0, end = nums.length - 1;
		while(start <= end) {
			
			int mid = start + (end - start) / 2;
			int currNum = nums[mid];

			if (currNum == target) 
				return mid;
			
			if (nums[start] <= currNum) {
				if (target >= nums[start] && target < currNum)
					end = mid - 1;
				else
					start = mid + 1;
			}
			else {
				if (target > currNum && target <= nums[end])
					start = mid + 1;
				else 
					end = mid - 1;
			}
		}
		return -1;
	}
}
