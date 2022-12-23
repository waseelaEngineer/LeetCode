
public class solution {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {1, 2, 3, 2, 3}));
	}
	
	static int singleNumber(int[] nums) {
		int res = 0;
		for (int i : nums) res ^= i;
		return res;
	}
}
