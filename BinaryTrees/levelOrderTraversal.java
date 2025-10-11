package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
public class levelOrderTraversal {
	
	  public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> ans=new ArrayList<List<Integer>>();
	        if(root==null) return ans;
	        Queue<TreeNode> q=new LinkedList<>();
	        q.add(root);
	        q.add(null);

	        ArrayList<Integer> curList=new ArrayList<>();
	        while(!q.isEmpty()){
	            TreeNode cur=q.poll();
	            if(cur==null){
	                ans.add(curList);
	                if(q.isEmpty()) return ans;
	                q.add(null);
	                curList=new ArrayList<>();

	            }else{
	                curList.add(cur.val);
	                if(cur.left!=null){
	                    q.add(cur.left);
	                }
	                    if(cur.right!=null){
	                    q.add(cur.right);
	                }
	            }
	        }
	        return ans;
	    }
	  
	  public static void main(String[] args) {
	        // Create a sample binary tree:
	        //         1
	        //        / \
	        //       2   3
	        //      / \   \
	        //     4   5   6

	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        root.right.right = new TreeNode(6);

	        levelOrderTraversal lot = new levelOrderTraversal();
	        List<List<Integer>> result = lot.levelOrder(root);

	        System.out.println("Level order traversal:");
	        for (List<Integer> level : result) {
	            System.out.print(level);
	        }
	    }


}
