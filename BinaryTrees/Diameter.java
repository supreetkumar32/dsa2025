package BinaryTrees;

import java.util.List;

public class Diameter {
	//first method
	int findDiameter(TreeNode root) {
		if(root==null)
			return 0;	
		//max distance between 2 node of left side
		int ld=findDiameter(root.left);	
		//max distance between 2 node of right side
		int rd=findDiameter(root.right);
		int f=height(root.left)+height(root.right)+2;
		int dia=Math.max(f,Math.max(rd, ld));		
		return dia;
	}
	
	private int height(TreeNode node) {
		if(node==null)
			return 0;
		int lh=height(node.left);
		int rh=height(node.right);
		int ans=Math.max(lh, rh)+1;		
		return ans;
	}
	
	//2nd method
	static class DiaPair{
		int ht;
		int dia;
	}
	
	public static DiaPair diameter2(Node node) {
		if(node==null) {
			DiaPair bp=new DiaPair();
			bp.ht=-1;
			bp.dia=0;
			return bp;
		}
		
		DiaPair lp=diameter2(node.left);
		DiaPair rp=diameter2(node.right);
		DiaPair mp=new DiaPair();
		mp.ht=Math.max(lp.ht,rp.ht)+1;
		
		int fes=lp.ht+rp.ht+2;
		mp.dia=Math.max(fes, Math.max(lp.dia, rp.dia));
		return mp;
	}

	public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(7);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(5);

        Diameter d = new Diameter();
        int result = d.findDiameter(root);
      
        System.out.println(result);
    }



}
