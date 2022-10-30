import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement))
                return new int[] { numMap.get(complement), i };
            else
                numMap.put(nums[i], i);
        }
        return new int[] {};
    }

	public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] {2,7,11,15}, 9);
        if (indices.length == 2)
            System.out.println(indices[0] + " " + indices[1]);
        else
            System.out.println("No solution found!");
	}
}