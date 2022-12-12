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
public class answer {

	public static void main(String[] args) {
		System.out.println(isValidBST(new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null))));
	}
	
	static boolean isValidBST(TreeNode root) {
		return validate(root, null, null);
	}
	
	static boolean validate(TreeNode root, Integer low, Integer high) {
		if (root == null) 
			return true;
		
		if ((low != null && root.val <= low) || (high != null && root.val >= high)) 
			return false;
		
		return validate(root.left, low, root.val) && validate(root.right, root.val, high); 
	}

}