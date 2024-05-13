package Linkedlist;
import Linkedlist.DoubleMain.Node;
public class ReverseDoubleLL {

    public static void Reverse(Node head){

        Node curr = head;
        Node nxt = null, prev = null;

        while(curr!=null){
          prev = curr;
          nxt = curr.next;
          curr.next = curr.prev;
          curr.prev = nxt;
          curr = nxt;
        }

        System.out.println(prev);
    }

}
