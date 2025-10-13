package BinaryTrees;

public class LowestCommonAncestor {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        // If current node is either p or q, return root
        if (root.val == p.val || root.val == q.val) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If p and q found in different subtrees → root is LCA
        if (left != null && right != null) return root;

        // Otherwise return whichever side is non-null
        return left != null ? left : right;
    }
	
	   public static void main(String[] args) {
	        /*
	                  3
	                 / \
	                5   1
	               / \ / \
	              6  2 0  8
	                / \
	               7   4
	        */

	        TreeNode root = new TreeNode(3);
	        root.left = new TreeNode(5);
	        root.right = new TreeNode(1);
	        root.left.left = new TreeNode(6);
	        root.left.right = new TreeNode(2);
	        root.right.left = new TreeNode(0);
	        root.right.right = new TreeNode(8);
	        root.left.right.left = new TreeNode(7);
	        root.left.right.right = new TreeNode(4);

	        LowestCommonAncestor sol = new LowestCommonAncestor();
	        TreeNode p = root.left;            // node 5
	        TreeNode q = root.left.right.right; // node 4

	        TreeNode lca = sol.lowestCommonAncestor(root, p, q);
	        System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + lca.val);
	    }

}
