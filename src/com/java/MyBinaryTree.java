package com.java;


public class MyBinaryTree<K extends Comparable<K>> {
    static MyBinaryNode myBinaryNode = new MyBinaryNode();
    static private MyBinaryNode root; // instance variable of type treeNode
    static int size;
    static BinaryClassTree binaryClassTree = new BinaryClassTree();

    public static void main(String[] args) {
        createBinaryTree();
        System.out.println("\nthe nodes are : ");
        binaryClassTree.traverseTreeKey(root);
        System.out.println("\nvalue present in the node : ");
        binaryClassTree.traverseTreeData(root);
        size = getSizeOfTree(root);
        System.out.println("\n\nthe size of the tree : " + size);
        System.out.println("\nsearching for for 63");
        System.out.println(findNode(63));
        System.out.println("\n");




    }

    public static void createBinaryTree() {
        MyBinaryNode first = new MyBinaryNode(56, 1);
        MyBinaryNode second = new MyBinaryNode(30, 2);
        MyBinaryNode third = new MyBinaryNode(70, 3);
        MyBinaryNode fourth = new MyBinaryNode(22, 4);
        MyBinaryNode fifth = new MyBinaryNode(40, 5);
        MyBinaryNode sixth = new MyBinaryNode(11, 6);
        MyBinaryNode seventh = new MyBinaryNode(3, 7);
        MyBinaryNode eight = new MyBinaryNode(16, 8);
        MyBinaryNode nine = new MyBinaryNode(60, 9);
        MyBinaryNode ten = new MyBinaryNode(95, 10);
        MyBinaryNode eleven = new MyBinaryNode(65, 11);
        MyBinaryNode twelve = new MyBinaryNode(63, 12);
        MyBinaryNode thirteen = new MyBinaryNode(67, 13);

        root = first; // first value will be assigned to root
        first.left = second; //second will be assigned to left of first
        first.right = third;//third will be assigned to right of first
        second.left = fourth;
        second.right = fifth;
        fourth.left = sixth;
        sixth.left = seventh;
        sixth.right = eight;
        third.left = nine;
        third.right = ten;
        nine.right = eleven;
        eleven.left = twelve;
        eleven.right = thirteen;




    }

    private static int getSizeOfTree(MyBinaryNode current) {
        return current == null ? 0 : 1 + getSizeOfTree(current.left)
                + getSizeOfTree(current.right);
    }

    public static MyBinaryNode findNode(int key) {
        MyBinaryNode node = root;
        while (node.key != key) {
            if (key < node.key) {
                node = node.left;
            } else {
                node = node.right;
            }
            if (node == null)
                return null;
        }
        return node;
    }
}
