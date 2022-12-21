import java.util.HashSet;
import java.util.Set;

public class solution {

	public static void main(String[] args) {
		System.out.println(longestConsecutive(new int[] {100,4,200,1,3,2}));
	}
	
	static int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums)
			set.add(num);
		
		int longestStreak = 0;
		
		for (int num : nums) {
			if (!set.contains(num - 1)) {
				int currNum = num;
				int currStreak = 1;
				
				while (set.contains(currNum + 1)) {
					currNum++;
					currStreak++;
				}
				
				longestStreak = Math.max(currStreak, longestStreak);
			}
		}
		
		return longestStreak;
	}
}
