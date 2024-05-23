package Linkedlist;
import Linkedlist.Main.Node;
public class clycleExist {

    public static  boolean Cycle(Node head){
        Node slow = head, fast= head;

        while(fast!=null && fast.next.next!=null){
              slow = slow.next;
              fast = fast.next.next;

              if(slow == fast)
                return true;
        }

        return  false;
    }

}
