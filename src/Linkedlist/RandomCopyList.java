package Linkedlist;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        if(head==null) return head;
        Node head2 = new Node(head.val);
        map.put(head,head2);
        Node original = head;
        Node copied = head2;


        // Start iterating
        original = original.next;
        while(original!=null){
            Node temp = new Node(original.val);
            map.put(original,temp);
            copied.next = temp;
            original = original.next;
            copied = copied.next;
        }

        original = head;
        while(original!=null){
            Node copy = map.get(original);
            Node orig = original.random;
            copy.random = map.get(orig);

            original = original.next;
        }

        return head2;
    }

    public Node copyWithoutAnySpace(Node head){
        if(head==null) return head;

        Node curr = head , temp = null;

        // Create a node in between
        while(curr!=null){
            temp = curr.next;
            curr.next = new Node(curr.val); // attach to ther original value create new node
            curr.next.next = temp;
            curr= temp;
        }

        // update the random value
        curr = head;
        Node head2 = curr.next;
        while(curr!=null && curr.next!=null){
            if(curr.random!=null){
                curr.next.random  = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head ;
        while(curr!=null && curr.next!=null){
             temp = curr.next.next;
            if(temp==null) curr.next.next = null;
            else  curr.next.next = temp.next;
            curr.next= temp;
            curr = curr.next;


        }

        return head2;
    }


}

