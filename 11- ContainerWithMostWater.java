
public class answer {

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}
	
    static int maxArea(int[] heights) {
        int maxarea = 0;
        for (int L = 0; L < heights.length; L++)
            for (int R = L + 1; R < heights.length; R++)
                maxarea = Math.max(maxarea, Math.min(heights[L], heights[R]) * (R - L));
        return maxarea;
    }
}
