package com.datastructures;

import apple.laf.JRSUIUtils;

public class BinaryTree {

    TreeNode root;

    public BinaryTree() {
    }

    public void Add(int value) {
        root = AddNode(root, value);
    }

    public TreeNode AddNode(TreeNode root, int value) {

        if(root == null) {
            root = new TreeNode(value);
           return root;
        }


            if(root.value == value) {
                root.count++;
                return root;
            }
            if(value > root.value)
                root.right = AddNode(root.right, value);
            else if (value < root.value)
                root.left = AddNode(root.left, value);


        return root;
    }

    public void inOrderTraversal() {
         inOrder(root);
    }

    public void inOrder(TreeNode node) {
        if(node != null) {
            inOrder(node.left);
            System.out.println(node.value + " " + node.count);
            inOrder(node.right);
        }
    }

    public void preOrderTraversal() {
        preOrder(root);
    }

    public void preOrder(TreeNode node) {
        if(node != null) {
            System.out.println(node.value + " " + node.count);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrderTraversal() {
        postOrder(root);
    }

    public void postOrder(TreeNode node) {
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.value + " " + node.count);
        }
    }

    public void levelOrderTraverse() {

    }
}
