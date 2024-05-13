package Linkedlist;

public class Operations {
    // iterating to the head
    public static void iteration(Main.Node head){
        while(head!=null){
            System.out.print(head.data + "->");
            head = head.next;

        }
    }


    // Adding the Values to top and inbetween and end
    public static void addTop(Main.Node head, int k ){
        Main.Node newNode = new Main.Node(k);
        // create new element and add its next to the currhead
            newNode.next = head;
            head = newNode;
            iteration(head);
        }

    // Adding value at end
    // one directly adding at the null or traverse and add at the end
    public static int  Size(Main.Node head){
        int count = 1;
        while(head!=null){
            count++;
            System.out.print(head.data + "->");
            head = head.next;
        }

        return count;
    }

    // adding at the end of the list
    public static void addAtEnd(Main.Node head , int k){
        Main.Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Main.Node(k);

        iteration(head);
    }

    public static void addInbetween(Main.Node head , int k){

      // iteration
        Main.Node newNode = new Main.Node(90);
        newNode.next = head.next;
        head.next = newNode;
        iteration(head);
    }

    public static void addAtRandom(Main.Node head, int target){

        Main.Node temp = head;
        while(temp!=null){
            if(temp.data== target){
                Main.Node prev = new Main.Node(33);
                prev.next = temp.next;
                temp.next = prev;
            }
            temp = temp.next;
        }

        iteration(head);
    }



}


