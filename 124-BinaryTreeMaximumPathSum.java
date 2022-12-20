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
	
	static int maxSum;

	public static void main(String[] args) {
		System.out.println(maxPathSum(new TreeNode(-10, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)))));
	}
	
	static int maxPathSum(TreeNode root) {
		maxSum = Integer.MIN_VALUE;
		gainFromSubtree(root);
		return maxSum;
	}
	
	static int gainFromSubtree(TreeNode root) {
		if (root == null) return 0;
		
		int gainFromLeft = Math.max(gainFromSubtree(root.left), 0);
		
		int gainFromRight = Math.max(gainFromSubtree(root.right), 0);
		
		maxSum = Math.max(maxSum, gainFromLeft + gainFromRight + root.val);
		
		return Math.max(gainFromLeft + root.val, gainFromRight + root.val);
	}
}
