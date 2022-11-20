
public class answer {

	public static void main(String[] args) {
		System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}

	static int trap(int[] height) {
		
		int l = 0, r = height.length - 1, sum = 0, lMax = 0, rMax = 0;
		while(l <= r) {
			lMax = Math.max(lMax, height[l]);
			rMax = Math.max(rMax, height[r]);
			if (lMax < rMax)
				sum += lMax - height[l++];
			else
				sum += rMax - height[r--];
		}
		return sum;
	}
}