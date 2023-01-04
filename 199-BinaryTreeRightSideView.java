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

public class solution {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
		System.out.println(rightSideView(root));
	}
	
	static List<Integer> rightSideView(TreeNode root){
		List<Integer> res = new ArrayList<>();
		rightView(root, res, 0);
		return res;
	}
	
	static void rightView(TreeNode root, List<Integer> res, int lvl) {
		if (root == null) return;
		
		if (lvl == res.size()) res.add(root.val);
		
		rightView(root.right, res, lvl + 1);
		rightView(root.left, res, lvl + 1);
	}

}
