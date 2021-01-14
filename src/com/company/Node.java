package com.company;

public class Node {
    Node prev;
    int data;
    Node next;

    public Node(int data) {
        this.prev = this.next = null;
        this.data = data;
    }

}
