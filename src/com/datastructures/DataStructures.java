package com.datastructures;

import java.util.LinkedList;

public class DataStructures {

    public static void main(String[] args) {
//
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBack(5);
//        System.out.println(list.length());
        list.insertAtBack(10);
//        System.out.println(list.length());
//        System.out.println(list.getAtIndex(1));
//        System.out.println(list.getAtIndex(0));
        list.insertAtFront(22);
        list.insertAtFront(1);



        System.out.println(list.getAtIndex(0));
        System.out.println(list.getAtIndex(1));
        System.out.println(list.getAtIndex(2));
        System.out.println(list.getAtIndex(3));

        list.deleteAtIndex(3);

        System.out.println(list.getAtIndex(0));
        System.out.println(list.getAtIndex(1));
        System.out.println(list.getAtIndex(2));
        System.out.println(list.getAtIndex(3));

        list.addAtIndex(2,99);


        BinaryTree tree = new BinaryTree();
        tree.Add(10);
        tree.Add(2);
        tree.Add(22);
        tree.Add(2);

        tree.preOrderTraversal();
        tree.inOrderTraversal();
        tree.postOrderTraversal();

    }
}
