package com.datastructures;


public class SinglyLinkedList {

    NodeHead linkedList;

    public SinglyLinkedList() {
        linkedList = new NodeHead();
    }

    public void insertAtFront(int value) {

        SinglyLinkedNode newNode = new SinglyLinkedNode(value);
        newNode.next = linkedList.head;
        linkedList.head = newNode;
    }

    public void insertAtBack(int value) {

        SinglyLinkedNode node = linkedList.head;
        SinglyLinkedNode newNode = new SinglyLinkedNode(value);
        if(linkedList.head == null)
            linkedList.head = newNode;
        else {
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }

    }

    public void addAtIndex(int index, int value) {
        int count = 0;
        SinglyLinkedNode node = linkedList.head;
        SinglyLinkedNode prev = null;
        SinglyLinkedNode newNode = new SinglyLinkedNode(value);

        if(node == null && index == 0) {
            insertAtFront(value);
            return;
        }

        if(index == 0) {
            insertAtFront(value);
            return;
        }

        while(node != null && index != count) {
            prev = node;
            node = node.next;
            count++;
        }

        if(node == null && prev == null){
            prev = newNode;
            return;
        }

        prev.next = newNode;
        prev.next.next = node;
    }


    public void deleteAtIndex(int index) {

        int count = 0;
        SinglyLinkedNode node = linkedList.head;
        SinglyLinkedNode prev = null;

        if (node != null && index == 0) {
            linkedList.head = node.next;
            return;
        }

        while(node != null && count != index) {
            prev = node;
            node = node.next;
            count++;
        }

        if(node == null)
            return;

        prev.next = node.next;

    }

    public int getAtIndex(int index) {

        int count = 0;
        SinglyLinkedNode node = linkedList.head;
        while(node != null) {
            if (count == index)
                return node.value;
            count++;
            node = node.next;
        }

        return -1;
    }

    public int length() {
        int count = 0;
        SinglyLinkedNode node = linkedList.head;
        while(node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
}
