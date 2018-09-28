package com.datastructures;

import java.util.LinkedList;

public class DataStructures {

    public static void main(String[] args) {

        LinkedList<Integer> thisLIst = new LinkedList<Integer>();
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

//        System.out.println(list.getAtIndex(0));
//        System.out.println(list.getAtIndex(1));
//        System.out.println(list.getAtIndex(2));
//        System.out.println(list.getAtIndex(3));
//        System.out.println(list.getAtIndex(4));
    }
}
