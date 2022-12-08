package subsets;

import java.util.ArrayList;
import java.util.List;

public class answer {

	public static void main(String[] args) {
		System.out.println(subsets(new int[] {1,2,3}));
	}
	
	static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> output = new ArrayList<>();
		output.add(new ArrayList<>());
		
		for (int num : nums) {
			List<List<Integer>> newSubsets = new ArrayList<>();
			
			for (List<Integer> curr : output)
				newSubsets.add(new ArrayList<>(curr) {{add(num);}});
			
			for (List<Integer> curr : newSubsets)
				output.add(curr);
		}
		return output;
	}
}
