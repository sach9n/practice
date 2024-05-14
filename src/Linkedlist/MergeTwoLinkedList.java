package Linkedlist;
import Linkedlist.Main.Node;
public class MergeTwoLinkedList {
    public Node mergeTwoLists(Node l1,Node l2) {
        Node head = null;

        if(l1==null) return null;
        if(l2== null) return null;

        if(l1.data <= l2.data){
            head = l1 ;
            l1 = l1.next;
        }else {
            head = l2;
            l2= l2.next;
        }

         Node curr = head;
        while(l1!= null && l2!=null){
            if(l1.data <= l2.data){
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2= l2.next;
            }

            while(l1!=null){
                l1 = l1.next;
            }

            while(l2!=null){
                l2 = l2.next;
            }
        }

        return head;
    }
  }


