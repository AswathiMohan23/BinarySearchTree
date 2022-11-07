package com.java;


public class MyBinaryTree<K extends Comparable<K>> {
   static MyBinaryNode myBinaryNode=new MyBinaryNode();
   static private MyBinaryNode root; // instance variable of type treeNode

    public static void main(String[] args){
        createBinaryTree();
        //int size=getSizeOfTree();
    }

    public static void createBinaryTree() {
        MyBinaryNode first = new MyBinaryNode(56);
        MyBinaryNode second = new MyBinaryNode(30);
        MyBinaryNode third = new MyBinaryNode(70);
        root = first; // first value will be assigned to root
        first.left = second; //second will be assigned to left of first
        first.right = third;//third will be assigned to right of first
        // second----first----third   ie, 30-----56----70
        int size=getSizeOfTree(root);
        System.out.println("the size of the tree : "+size);

    }
    private static int getSizeOfTree(MyBinaryNode current){
        return current==null ? 0 : 1+ getSizeOfTree(current.left)
                + getSizeOfTree(current.right);
    }
}
