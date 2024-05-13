package Linkedlist;

import java.util.LinkedList;

public class Main {

    static class Node {
        int data ;
        Node next ;

        Node(int data ){
            this.data = data;
        }
    }



    public static void main(String[] args) {
        Node node = new Node(1);
        Node head = node;

        Node node2 = new Node(2);
        node.next  =  node2;

        Node node3 = new Node(3);
        node2.next  =  node3;

        Node node4 = new Node(4);
        node3.next  =  node4;

        Node node5 = new Node(5);
        node4.next  =  node5;

//        Operations.iteration(head);
//        System.out.println();
//        Operations.addTop(head,5);
//        System.out.println();
//        Operations.addAtEnd(head,6);
//
//        System.out.println();
//        Operations.addInbetween(head,3);
//        System.out.println();
//        System.out.println();
//        System.out.println(" At Random");
//        Operations.addAtRandom(head,3);

//        System.out.println();
//        System.out.println();
//        System.out.println("Deleting Operations");
////        DeletingOperation.Delete(head,10);
////        Operations.iteration(head);


        // reverse Operation

//        System.out.println();
//        System.out.println();
//        ReversalOfList.reverseNode(head);
//

//        System.out.println();
//        System.out.println("get kth node");
//        KthdistanceFormLast.GetkthNode(head,1);
//
//
//        System.out.println();
//        System.out.println("Middle node");
//        GetMiddleoflinked.Middle(head);

        System.out.println();
        System.out.println();
        AlternateSplit.SplitNode(head);
    }
}
