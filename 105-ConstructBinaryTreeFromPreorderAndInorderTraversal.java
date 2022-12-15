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
import java.util.HashMap;
import java.util.Map;

public class solution {

	static int preorderIndex;
	static Map<Integer, Integer> inorderIndexMap;
	
	public static void main(String[] args) {
		TreeNode res = buildTree(new int[] {3,9,20,15,7}, new int [] {9,3,15,20,7});
	}
	
	static TreeNode buildTree(int[] preorder, int[] inorder) {
		preorderIndex = 0;
		
		inorderIndexMap = new HashMap<>();
		for (int i = 0; i < inorder.length; i++)
			inorderIndexMap.put(inorder[i], i);
		
		return arrayToTree(preorder, 0, preorder.length - 1);
	}
	
	static TreeNode arrayToTree(int[] preorder, int left, int right) {
		if (left > right) return null;
		
		int rootValue = preorder[preorderIndex++];
		TreeNode root = new TreeNode(rootValue);
		
		root.left = arrayToTree(preorder, left, inorderIndexMap.get(rootValue) - 1);
		root.right = arrayToTree(preorder, inorderIndexMap.get(rootValue) + 1, right);
		
		return root;
	}
}
