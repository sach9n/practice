package Linkedlist;
import Linkedlist.Main.Node;
public class AlternateSplit {

    public static void SplitNode(Node head){
        Node a , b , temp, curr = head;
         a = head;
        if(head==null && head.next==null){
            b = null;
            System.out.println(head);
        }
        b = head.next;

        while(curr.next!= null){
            temp = curr.next;
            curr.next = curr.next.next;
            curr = temp;
        }


    }
}
