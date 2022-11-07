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
        MyBinaryNode fourth = new MyBinaryNode(22);
        MyBinaryNode fifth = new MyBinaryNode(40);
        MyBinaryNode sixth = new MyBinaryNode(11);
        MyBinaryNode seventh = new MyBinaryNode(3);
        MyBinaryNode eight = new MyBinaryNode(16);
        MyBinaryNode nine = new MyBinaryNode(60);
        MyBinaryNode ten = new MyBinaryNode(95);
        MyBinaryNode eleven = new MyBinaryNode(65);
        MyBinaryNode twelve = new MyBinaryNode(63);
        MyBinaryNode thirteen = new MyBinaryNode(67);

        root = first; // first value will be assigned to root
        first.left = second; //second will be assigned to left of first
        first.right = third;//third will be assigned to right of first
        second.left=fourth;
        second.right=fifth;
        fourth.left=sixth;
        sixth.left=seventh;
        sixth.right=eight;
        third.left=nine;
        third.right=ten;
        nine.right=eleven;
        eleven.left=twelve;
        eleven.right=thirteen;

        int size=getSizeOfTree(root);
        System.out.println("the size of the tree : "+size);

    }
    private static int getSizeOfTree(MyBinaryNode current){
        return current==null ? 0 : 1+ getSizeOfTree(current.left)
                + getSizeOfTree(current.right);
    }
}
