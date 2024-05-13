package Linkedlist;
import Linkedlist.Main.Node;
public class FindACyclePoint {



      public static Node getCycleNode(Node head){

          Node position = ReversalOfList.reverseNode(head);
          Node entery= head;
          while(entery != position){
              entery = entery.next;
              position= position.next;
          }

          return  position;
      }
}
