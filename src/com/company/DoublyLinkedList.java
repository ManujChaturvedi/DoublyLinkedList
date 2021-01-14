package com.company;

public class DoublyLinkedList {

    Node head;//pointing to the front.
    Node last;//pointing to the last.

    public void insert(int data){
        if (head == null && last == null) head = last = new Node(data);
        else insertP(data);
    }

//    @Override
    private void insertP(int data){
        last.next = new Node(data);
        last.next.prev = last;
        last = last.next;
    }

    public void print(){
        print(head);
    }

    private void print(Node head){
        Node temp = head;
        while (temp!=null){
            try {
                System.out.println(temp.prev.data +" <-"+temp.data+"-> "+temp.next.data);
            }catch (NullPointerException np){
                if (temp.prev == null)
                    System.out.println( "null <-"+temp.data+"-> "+temp.next.data);
                else if (temp.next == null)
                    System.out.println( temp.prev.data+" <-" +temp.data+"-> null");
            }

            temp=temp.next;
        }
        System.out.println();
    }

}
