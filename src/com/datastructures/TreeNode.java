package com.datastructures;


public class TreeNode {

    int value;
    int count;
    TreeNode left, right;


    public TreeNode(){

    }

    public  TreeNode(int value) {
        this.value = value;
        this.count = 1;
        this.left = null;
        this.right = null;
    }
}
