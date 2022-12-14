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
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class solution {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
		System.out.println(levelOrder(root));
	}
	
	static List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> res = new LinkedList<>();
		Queue<TreeNode> q = new LinkedList<>();
		
		if (root == null) return res;
		
		q.offer(root);
		while(!q.isEmpty()) {
			int lvl = q.size();
			List<Integer> temp = new LinkedList<>();
			for (int i = 0; i < lvl; i++) {
				if (q.peek().left != null) q.offer(q.peek().left);
				if (q.peek().right != null) q.offer(q.peek().right);
				temp.add(q.poll().val);
			}
			res.add(temp);
		}
		return res;
	}
}