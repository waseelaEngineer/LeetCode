// Time: O(n)
// Space: O(1)
import java.util.HashMap;

public class solution {

	public static void main(String[] args) {
		System.out.println(subarraySum(new int[] {1,1,1}, 2));
	}
	
	static int subarraySum(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0, sum = 0;
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

}
