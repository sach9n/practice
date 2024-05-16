package Linkedlist;
import Linkedlist.Main.Node;
public class KthdistanceFormLast {

    // Correct code for leet codevale
    public static Node RemoveKthFrom(Node head, int n){
        Node temp = new Node(0);
        temp.next = head;
        Node slow = temp, fast = temp;

        for(int i =0; i<=n;i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow=   slow.next;
            fast =  fast.next;
        }

        slow.next = slow.next.next;

        return temp.next;
    }

    public static Node GetkthNode(Node head ,  int k){
        Node slow = head , fast = head;
        Node prev = null;
        Node temp = fast;int i = 0;



        while(fast!=null && i<k){
            i++;
            fast = fast.next;
            temp = temp.next;
        }
        System.out.println(temp.data);

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;

        }
        if(temp.data == slow.data){
            System.out.println(head.data);
        }
//         temp.next = slow.next;
//          Operations.iteration(head);
//        System.out.println(temp.next.data);
//
//        System.out.println(slow.next.data);
////
//        System.out.println();
//        System.out.println(slow.data);
//        return slow;
        return slow;
    }

}
