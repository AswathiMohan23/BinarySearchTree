package com.java;

public class BinaryClassTree {
        MyBinaryNode root;

        // Traverse tree
        public void traverseTreeData(MyBinaryNode myBinaryNode) {
            if (myBinaryNode != null) {
                traverseTreeData(myBinaryNode.left);
                System.out.print(" " + myBinaryNode.data);
                traverseTreeData(myBinaryNode.right);
            }
        }
    public void traverseTreeKey(MyBinaryNode myBinaryNode) {
        if (myBinaryNode != null) {
            traverseTreeKey(myBinaryNode.left);
            System.out.print(" " + myBinaryNode.key);
            traverseTreeKey(myBinaryNode.right);
        }

    }


}

