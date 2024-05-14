package Linkedlist;
import Linkedlist.sortList.*;
class  ReverseKthGroup {
    // chech for the number of elemnts till k
    public boolean isKth(ListNode head, int k){
        int count = 0;
        while(head!=null && count< k){

            head = head.next;
            count++;
        }
        return count==k;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k<=1 ||!isKth(head,k)) return head;

        ListNode curr= head , prev = null, nxt = null;
        int count = 1;
        while(curr!=null && count<=k ){
            nxt  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            count++;
        }

        head.next = reverseKGroup(curr,k);

        return prev;
    }
}