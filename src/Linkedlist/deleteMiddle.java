package Linkedlist;
import Linkedlist.Main.Node;

public class deleteMiddle {



   public static Node DeletelMiddle(Node head){
       if(head==null) return null;
       Node slow = head , fast=head , prev=null;
       while(fast!=null && fast.next!=null){
           prev = slow;
           slow = slow.next;
           fast = fast.next.next;
       }

       if(prev!=null){
           prev.next = slow.next;
       }else {
           head = head.next;
       }

       return head;
   }
}
