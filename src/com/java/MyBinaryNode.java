package com.java;

public class MyBinaryNode <K extends  Comparable<K>>{
    // extending comparable because we are putting keys in the sorted order
    //when its in sorted order its easier to search the key

    K data;

    public int key;
    //consists of a left pointer as well as a right pointer
    MyBinaryNode<K> left; //POINTER TO LEFT TREE NODE
    MyBinaryNode<K> right;//POINTER TO LEFT TREE NODE


    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    public MyBinaryNode(int item) {
        key = item;
        left = right = null;
    }

    public MyBinaryNode() {}

   /* public MyBinaryNode(K data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }*/

    public MyBinaryNode(K data, int key) {
        this.data = data;
        this.key = key;
        left = right = null;

    }

}



