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

// Time: O(n)
// Space: O(n)
public class solution {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
		System.out.println(diameterOfBinaryTree(root));
	}
	
	static int max = 0;
	
	static int diameterOfBinaryTree(TreeNode root) {
	    maxDepth(root);
	    return max;
	}
	
	static int maxDepth(TreeNode root) {
	    if (root == null) return 0;
	    
	    int left = maxDepth(root.left);
	    int right = maxDepth(root.right);
	    
	    max = Math.max(max, left + right);
	    
	    return Math.max(left, right) + 1;
	}

}
