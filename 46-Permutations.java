package permutations;

import java.util.ArrayList;
import java.util.List;

public class answer {

	public static void main(String[] args) {
		System.out.println(Permutations(new int[] {1,2,3}));
	}
	
	static List<List<Integer>> Permutations(int[] nums){
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), nums);
		return list;
	}
	
	static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
		if (tempList.size() == nums.length) 
			list.add(new ArrayList<Integer>(tempList));
		else
			for(int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i])) continue;
				tempList.add(nums[i]);
				backtrack(list, tempList, nums);
				tempList.remove(tempList.size() -  1);
			}
	}
}
