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
import java.util.HashMap;

public class solution {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10, new TreeNode(5, new TreeNode(3, new TreeNode(3), new TreeNode(-2)), new TreeNode(2, null, new TreeNode(1))), new TreeNode(-3, null, new TreeNode(11)));
		System.out.println(pathSum(root, 8));
	}
	
	static int pathSum(TreeNode root, int targetSum) {
		HashMap<Long, Integer> map = new HashMap<>();
		map.put(0L, 1);
		return helper(root, targetSum, 0L, map);
	}
	
	static int helper(TreeNode root, int targetSum,Long currSum, HashMap<Long, Integer> map) {
		if (root == null) return 0;
		currSum += root.val;
		int count = 0;
		if (map.containsKey(currSum - targetSum)) {
			count += map.get(currSum - targetSum);
		}
		map.put(currSum, map.getOrDefault(currSum, 0) + 1);
		int left = helper(root.left, targetSum, currSum, map);
		int right = helper(root.right, targetSum, currSum, map);
		map.put(currSum, map.get(currSum) - 1);
		
		return count + left + right;
	}

}
