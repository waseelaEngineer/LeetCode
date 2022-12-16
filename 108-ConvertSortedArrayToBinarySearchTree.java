/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class solution {

	public static void main(String[] args) {
		TreeNode res = sortedArrayToBST(new int[] {-10,-3,0,5,9});	
	}
	
	static TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) return null;
		return makeBST(nums, 0, nums.length - 1);
	}
	
	static TreeNode makeBST(int[] nums, int low, int high) {
		if (low > high) return null;
		int mid = (low + high) / 2;
		
		TreeNode root = new TreeNode(nums[mid]);
		root.left = makeBST(nums, low, mid - 1);
		root.right = makeBST(nums, mid + 1, high);
		
		return root;
	}
}
