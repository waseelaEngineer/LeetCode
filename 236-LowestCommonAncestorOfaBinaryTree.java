/**
 * Definition for a binary tree node.
 public class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int val) { this.val = val; }
	 TreeNode(int val, TreeNode left, TreeNode right){
		 this.val = val;
		 this.left = left;
		 this.right = right;
	 }
 }
 */
class solution {

    static TreeNode ans;
    
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), null));
    	System.out.println(lowestCommonAncestor(root, root.right, root.right.left).val);
    }

    public solution() {
        ans = null;
    }

    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	recurseTree(root, p, q);
    	return ans;
    }

    static boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {

        if (currentNode == null) return false;

        int left = recurseTree(currentNode.left, p, q) ? 1 : 0;

        int right = recurseTree(currentNode.right, p, q) ? 1 : 0;

        int mid = (currentNode == p || currentNode == q) ? 1 : 0;


        if (mid + left + right >= 2) ans = currentNode;

        return (mid + left + right > 0);
    }
}