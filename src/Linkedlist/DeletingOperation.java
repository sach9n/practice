package Linkedlist;
import Linkedlist.Main.Node;
public class DeletingOperation {

    public static Node Delete(Node head,int k){


        Node curr = head;
        Node prev = null;

        if(head.data == k){
            head = head.next;
            return head;
        }

        while(curr!=null && curr.data!=k){
            prev = curr;
            curr = curr.next;

        }

        if(curr == null){

            return head;
        }

        prev.next = curr.next;

        return  head;
    }





}
