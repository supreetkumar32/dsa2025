package BinaryTrees;

// class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
public class basicQOfBinaryTree {

    public static int heightOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int lh = heightOfBinaryTree(root.left);
        int rh = heightOfBinaryTree(root.right);

        return Math.max(lh, rh) + 1;
    }
    
    public static int minOfBinaryTree(TreeNode root) {
        if (root == null)
            return Integer.MAX_VALUE;;
        
        int left= minOfBinaryTree(root.left);
        int right= minOfBinaryTree(root.right);
        int ans=Math.min(root.val, Math.min(left, right));
        return ans;
    	
    }

    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \
             4   5
        Height = 3
        */

        TreeNode root = new TreeNode(100);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

//        int height = heightOfBinaryTree(root);
//        System.out.println("Height of binary tree: " + height);
        
        int minInTree = minOfBinaryTree(root);
        System.out.println("min of binary tree: " + minInTree);
    }
}

