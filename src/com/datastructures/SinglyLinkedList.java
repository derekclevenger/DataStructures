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

    }
    //may need to update this not sure its 100*
    public void deleteAtIndex(int index) {

        int count = 0;
        SinglyLinkedNode node = linkedList.head;
        if(node == null)
            return;
        while(node != null) {
            if(count == index)
                node.value = node.next.value;
             node = node.next;
        }

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
