
public class answer {

	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}));
	}
	
	static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int s1 = nums1.length;
		int s2 = nums2.length;
		double[] sortedArr = new double[s1 + s2];
		
		int i=0, j=0, k=0;
		while(i<s1 && j<s2) {
			if (nums1[i] <= nums2[j]) {
				sortedArr[k] = nums1[i];
				i++;
				k++;
			}
			else {
				sortedArr[k] = nums2[j];
				j++;
				k++;
			}
		}
		
		if (i >= s1) {
			for (int t = j; t < s2; t++) {
				sortedArr[k] = nums2[t];
				k++;
			}
		}
		if (j >= s2) {
			for (int t = i; t < s1; t++) {
				sortedArr[k] = nums1[t];
				k++;
			}
		}
		
		if (sortedArr.length % 2 != 0)
			return sortedArr[sortedArr.length / 2];
		else
			return (sortedArr[sortedArr.length /2] + sortedArr[sortedArr.length / 2 - 1]) /2;
	}

}
