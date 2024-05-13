package Linkedlist;
import Linkedlist.Main.Node;
public class ReversalOfList {
   public static Node reverseNode(Node head){
       Node curr = head;
       Node prev = null,nxt = null;


       while(curr!=null){
           nxt = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nxt;
       }

       head = prev;
       System.out.println();
       return head;
   }


    public static Node   reverseRec(Node curr, Node prev){
       if(curr== null){
           return prev;
       }

       Node nxt = curr.next;
       curr.next = prev;
       reverseRec(nxt,curr);

       return null;
   }
}
