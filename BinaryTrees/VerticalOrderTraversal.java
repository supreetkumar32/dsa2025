package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

//we ahve made pair to store the horizontal distance and node
 class Pair{
	 int hd;
	 TreeNode node;
	 
	 public Pair(int hd,TreeNode node) {
		 this.hd=hd;
		 this.node=node;
	 }	 
 }

public class VerticalOrderTraversal {
	
	//public ArrayList<Integer> verticalOrderTypeOne(TreeNode root){
	public List<List<Integer>> verticalOrderTypeTwo(TreeNode root){
		Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
		if(root==null) return null;
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(0,root));
		while(!q.isEmpty()) {
			Pair cur=q.poll();//taking out the first pair (root and its horizontal distance )from queue
			int key=cur.hd;
			if(!map.containsKey(key)) {//agar(key as horizontal distance present nahi hoga to har baar key ke corresponding mey arraylist create karenge)
				map.put(key, new ArrayList<Integer>());
			}
			map.get(key).add(cur.node.val);
			if(cur.node.left!=null) {
				q.add(new Pair(key-1,cur.node.left));
			}
			if(cur.node.right!=null) {
				q.add(new Pair(key+1,cur.node.right));
			}
		}
		
		//for type 1
//		ArrayList<Integer> ans=new ArrayList<>();
//		for(ArrayList<Integer> e:map.values()) {
//			ans.addAll(e);
//		}
		
		//for type 
		 List<List<Integer>> ans = new ArrayList<>();
	        for (ArrayList<Integer> e : map.values()) {	        	
	            ans.add(e);
	        }
		return ans;
	}
	

	    //  Main method to test the code
	    public static void main(String[] args) {

	        TreeNode root = new TreeNode(2);
	        root.left = new TreeNode(3);
	        root.right = new TreeNode(1);
	        root.left.left = new TreeNode(4);
	        root.left.left.right = new TreeNode(7);
	        root.right.right = new TreeNode(6);
	        root.right.left = new TreeNode(5);

	        VerticalOrderTraversal rsv = new VerticalOrderTraversal();
	       // List<Integer> result = rsv.verticalOrderTypeOne(root);//[4, 3, 7, 2, 5, 1, 6]
	        
	        List<List<Integer>> result = rsv.verticalOrderTypeTwo(root);//[[4], [3, 7], [2, 5], [1], [6]]

	        System.out.println(result);
	    }

}
