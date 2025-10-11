package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LeftView {
	 public List<Integer> leftSideView(TreeNode root) {
	        ArrayList<Integer> ans = new ArrayList<>();
	        int level = 0;
	        leftSidePrint(root, level, ans);
	        return ans;
	    }

	    void leftSidePrint(TreeNode root, int level, ArrayList<Integer> ans) {
	        if (root == null) return;
	        if (ans.size() == level) {
	            ans.add(root.val);
	        }
	        // visit right subtree first, then left

	        leftSidePrint(root.left, level + 1, ans);
	        leftSidePrint(root.right, level + 1, ans);
	    }

	    // 👇 Main method to test the code
	    public static void main(String[] args) {
	        /*
	               1
	              / \
	             2   3
	              \   \
	               5   4
	        Expected Right Side View: [1, 3, 4]
	        */

	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.right = new TreeNode(5);
	        root.left.right.left = new TreeNode(6);
	        root.right.right = new TreeNode(4);

	        LeftView rsv = new LeftView();
	        List<Integer> result = rsv.leftSideView(root);

	        System.out.println("Right Side View of Tree:");
	        System.out.println(result);
	    }

}
