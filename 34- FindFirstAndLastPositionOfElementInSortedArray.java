// solved using array and binary search
public class answer {

	public static void main(String[] args) {
		int[] arr = {-1, -1};
		int[] test = {5,7,7,8,8,10};
		arr[0] = search(test, 8, true);
		if (arr[0] != -1)
			arr[1] = search(test, 8, false);
		System.out.println(arr[0] + " " + arr[1]);    // 3 4
	}
	
	static int search(int[] nums, int target, boolean first) {
		
		int ans = -1, start = 0, end = nums.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if (target > nums[mid])
				start = mid + 1;
			
			else if (target < nums[mid])
				end = mid - 1;
			
			else {
				ans = mid;
				if (first)
					end = mid - 1;
				else 
					start = mid + 1;
			}
		}
		return ans;
	}
}
