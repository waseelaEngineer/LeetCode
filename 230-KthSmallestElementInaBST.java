import java.util.LinkedList;
import java.util.Stack;

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
		TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
		System.out.println(kthSmallest(root, 2));
	}
	
	static int kthSmallest(TreeNode root, int k) {
		LinkedList<TreeNode> stack = new LinkedList<>();
		
		while (true) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			
			root = stack.pop();
			if (k-- == 1) return root.val;
			root = root.right;
		}
	}
}
