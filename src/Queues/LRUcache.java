package Queues;

import java.util.HashMap;
import java.util.Map;

public class LRUcache {
    // VeryVery Important
    // Decleare double Node

    class Node {
        int key ;
        int value ;
        Node prev ;
        Node next ;

        Node(int key , int value){
            this.key = key;
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }

     Map<Integer,Node > map = new HashMap<>();
    int capacity = 5;
    Node head = null; Node tail = null;
    Node temp;
    public void put(int key , int value){

        // update and move to
        if(map.containsKey(key)){
            temp = map.get(key);
            temp.value = value;
        }else {
            if(map.size() >= capacity){
                // remove the cache
            }

            temp = new Node(key,value);
            map.put(key,temp);
            // add to the map
        }

    }

    public void movetohead(){

    }

    public void addTohead(Node head){
        if(head == null){
            head =tail;
        }else {
            temp.next = head;
        }
    }

}
