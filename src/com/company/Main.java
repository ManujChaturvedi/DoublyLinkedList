package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(1);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(3);
        doublyLinkedList.insert(4);
        doublyLinkedList.insert(5);
        doublyLinkedList.print();

        doublyLinkedList.delete(2);
        doublyLinkedList.print();
    }
}
