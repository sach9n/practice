package Linkedlist;

public class DoubleMain {

    static class Node{
        int data ;
        Node prev = null;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node dnode = new Node(1);
        Node head = dnode;

        Node dnode2 = new Node(2);
        dnode.next = dnode2;

        Node dnode3 = new Node(3);
        dnode2.next = dnode3;

        Node dnode4 = new Node(4);
        dnode3.next = dnode4;

    }
}
