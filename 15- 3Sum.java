import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class answer {

	public static void main(String[] args) {
		System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
	}
	
	static List<List<Integer>> threeSum(int[] nums){
		Arrays.sort(nums);
		Set<List<Integer>> threeSum = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while(j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0) {
					List<Integer> triplet = new ArrayList<>();
					triplet.add(nums[i]);
					triplet.add(nums[j]);
					triplet.add(nums[k]);
					threeSum.add(triplet);
					j++;
					k--;
				}
				else if (sum > 0)
					k--;
				else
					j++;				
			}
		}
		return new ArrayList<>(threeSum);
	}

}
