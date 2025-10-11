package BinaryTrees;

import java.util.Scanner;

class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data=data;
    }
}
public class Basic {

	Scanner sc;
	Node root;
	
	public Basic(){
	    sc=new Scanner(System.in);
	}
	
	Node createBinaryTree(){
	    System.out.println("enter node data");
	    int data=sc.nextInt();
	    if(data==-1) return null;
	
	    Node node=new Node(data);
	    System.out.println("Enter "+ data + "left data");
	    node.left=createBinaryTree();
	
	    System.out.println("Enter "+ data + "right data");
	    node.right=createBinaryTree();
	
	    return node;
	}
	
	void inOrderTraversal(Node root){
	    if(root==null)
	        return;
	    inOrderTraversal(root.left);
	    System.out.println(root.data);
	    inOrderTraversal(root.right);
	}
	
	void preOrderTraversal(Node root){
	    if(root==null)
	        return;
	    System.out.println(root.data);
	    inOrderTraversal(root.left);
	    inOrderTraversal(root.right);
	
	}
	
	void postOrderTraversal(Node root){
	    if(root==null)
	        return;
	    inOrderTraversal(root.left);
	    inOrderTraversal(root.right);
	    System.out.println(root.data);
	}
	
	int heightOfBinaryTree(Node root){
	    if(root==null) return 0;
	    int lh=heightOfBinaryTree(root.left);
	    int rh=heightOfBinaryTree(root.right);
	    return Math.max(lh,rh)+1;
	}
	
	//print all nodes present at distance k from root
	void printNodesAtKDisteance(Node root,int k) {
		if(root==null) return;
		if(k==0) System.out.println(root.data);
		
		printNodesAtKDisteance(root.left,k-1);
		printNodesAtKDisteance(root.right,k-1);
		
	}

}
