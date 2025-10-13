package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class printAllAncestors {
	
	public static ArrayList<Integer> ancestors(TreeNode root,int target){
		ArrayList<Integer> ans=new ArrayList<>();
		isPresent(root,target,ans);
		return ans;
	}
	
	public static boolean isPresent(TreeNode root,int target,ArrayList<Integer> ans) {
		if(root==null) return false;
		if(root.val==target) return true;
		if(isPresent(root.left,target,ans)||isPresent(root.right,target,ans)) {
			ans.add(root.val);
			return true;
		}
		return false;
	}
	
    public static void main(String[] args) {
        /*
               1
              / \
             2   3
              \   \
               5   4
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.right.right = new TreeNode(4);

        printAllAncestors rsv = new printAllAncestors();
        ArrayList<Integer> ans=rsv.ancestors(root,4);
        System.out.println(ans);
    }

}
