package Linkedlist;
import Linkedlist.Main.Node;

public class AddTwoLinkedList {

    public static Node addListNode(Node l1, Node l2){
        // Reverse the Node if not
        int sum , val ,rem=0;
        Node head = null , curr = null;

        while(l1!=null &&  l2!=null){
           sum = l1.data + l2.data + rem;

           val = sum%10;
           rem = sum/10;
          if(head==null){
              head = new Node(val);
              curr = head;
          }else {
              curr.next = new Node(val);
              curr = curr.next;
          }
          l1 = l1.next;
          l2 = l2.next;
        }

        while(l1!=null){
            sum = l1.data + rem;
            val = sum%10;
            rem = sum/10;
            curr.next = new Node(val);
            curr = new Node(val);
            l1 =l1.next;

        }


        while(l2!=null){
            sum = l2.data + rem;
            val = sum%10;
            rem = sum/10;
            curr.next = new Node(val);
            curr = curr.next;
            l2 =l2.next;
        }

        if(rem!=0){
            curr.next =  new Node(rem);
        }
        Operations.iteration(head);
        return head;
    }

}
