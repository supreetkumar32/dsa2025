package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightView {

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        int level = 0;
        rightSidePrint(root, level, ans);
        return ans;
    }

    void rightSidePrint(TreeNode root, int level, ArrayList<Integer> ans) {
        if (root == null) return;
        if (ans.size() == level) {
            ans.add(root.val);
        }
        // visit right subtree first, then left
        rightSidePrint(root.right, level + 1, ans);
        rightSidePrint(root.left, level + 1, ans);
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
        root.right.right = new TreeNode(4);

        rightView rsv = new rightView();
        List<Integer> result = rsv.rightSideView(root);

        System.out.println("Right Side View of Tree:");
        System.out.println(result);
    }
}