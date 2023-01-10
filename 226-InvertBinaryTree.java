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
		TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, new TreeNode(4)));
		invertTree(root);
	}
	
	static TreeNode invertTree(TreeNode root) {
		if (root == null) return null;
		
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
}
