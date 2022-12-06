
public class answer {

	public static void main(String[] args) {
		int[] test = {2,0,2,1,1,0};
		sortColors(test);
	}
	
    static void sortColors(int[] nums) {
    	if (nums == null || nums.length < 2) return;
    	
    	int low = 0;
    	int high = nums.length - 1;
    	for (int i = 0; i < high;) {
    		if (nums[i] == 0) {
    			swap(nums, i, low);
    			low++;
    			i++;
    		}
    		else if (nums[i] == 2) {
    			swap(nums, i, high);
    			high--;
    		}
    		else
    			i++;
    	}
    }
    
    static void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
