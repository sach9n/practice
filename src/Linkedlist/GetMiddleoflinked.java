package Linkedlist;
import Linkedlist.Main.Node;
public class GetMiddleoflinked {

    public static Node Middle(Node head) {
        Node slow = head, fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
       return slow;
    }
}
