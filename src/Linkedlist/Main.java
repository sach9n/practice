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

        Node node2 = new Node(3);
        node.next  =  node2;

        Node node3 = new Node(4);
        node2.next  =  node3;

        Node node4 = new Node(7);
         node3.next = node4;

        Node node5 = new Node(1);
        node4.next  =  node5;

        Node node6 = new Node(2);
        node5.next  =  node6;

        Node node7 = new Node(6);
        node6.next  =  node7;

        //
//        Node nodes = new Node(5);
//        Node heads = nodes;
//
//        Node nodes2 = new Node(6);
//        nodes.next  =  nodes2;
//
//        Node nodes3 = new Node(4);
//        nodes2.next  =  nodes3;





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

//        System.out.println();
//        System.out.println();
//        AlternateSplit.SplitNode(head);
//
//        System.out.println();
//        System.out.println();
//        AddTwoLinkedList.addListNode(head, heads);

//        RotateKtimes.RotateKth(head,4);
//        Operations.iteration(head);
//

          deleteMiddle.DeletelMiddle(head);
          Operations.iteration(head);

    }
}
