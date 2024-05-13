package Linkedlist;
import Linkedlist.Main.Node;
public class PalandriumOrNot {

    public static Node revNode(Node head){
        Node curr = head;
        Node prev = null, nxt = null;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
         head = prev;
        return head;
    }
    public static boolean isPalandrium(Node head){
        Node mid = GetMiddleoflinked.Middle(head);
        Node firstHalf = head;
        Node secondHalf = revNode(mid);

        while(secondHalf!=null && firstHalf!=null){
            if(secondHalf.data== firstHalf.data){
                return true;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return false;

    }
}
