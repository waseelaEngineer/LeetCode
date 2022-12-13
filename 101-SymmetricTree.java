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
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)), new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null)));
		System.out.println(isSymmetric(root));
	}
	
	static boolean isSymmetric(TreeNode root) {
		return root == null || helper(root.left, root.right);
	}
	
	static boolean helper(TreeNode left, TreeNode right) {
		if (left == null || right == null)
			return left == right;
		
		if (left.val != right.val)
			return false;
		
		return helper(left.left, right.right) && helper(left.right, right.left); 
	}

}
