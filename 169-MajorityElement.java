
public class solution {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {3,2,3}));
	}
	
	static int majorityElement(int[] nums) {
		int count = 0;
		Integer candidate = null;
		for (int num : nums) {
			if (count == 0)
				candidate = num;
			count += (candidate == num) ? 1 : -1;
		}
		return candidate;
	}

}
