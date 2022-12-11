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

import java.util.ArrayList;
import java.util.List;

public class answer {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
		System.out.println(inorderTraversal(root));
	}
	
	static List<Integer> inorderTraversal(TreeNode root){ 
		// Morris traversal, time = O(n), space = O(1)
		List<Integer> res = new ArrayList<>();
		TreeNode curr = root;
		while (curr != null) {
			if (curr.left == null) {
				res.add(curr.val);
				curr = curr.right;
			}
			else {
				TreeNode pre = curr.left;
				while (pre.right != null) {
					pre = pre.right;					
				}
				pre.right = curr;
				TreeNode temp = curr; 
				curr = curr.left;
				temp.left = null;
			}
		}
		return res;
	}
}
