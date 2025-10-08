package com.codingshuttle.springboot0To100.hospitalManagementSystem.BinaryTrees;

public class MainClass {
    public static void main(String[] args){
        Basic btree = new Basic();
        Node root=btree.createBinaryTree();
        btree.inOrderTraversal(root);
        btree.preOrderTraversal(root);
        btree.postOrderTraversal(root);
    }
}
