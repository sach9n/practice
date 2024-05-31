package Queues;

public class queueUsingArray {

    int capacity = 5;
    int queueSize = 0;
    int[] nums = new int[capacity];

    int front=0, rear = -1;

    public  void enqueue(int val){
        if(queueSize==capacity){
            System.out.println("Queue is Filled");
        }else {
             rear = (rear+1)%capacity;
             nums[rear] = val;
             queueSize++;
        }
    }

    public   int dequeue(){
        if(queueSize==0){
            System.out.println("Queue is empty");
            return -1;
        }else {
            int x = nums[front];
            front = (front+1)%capacity;
            queueSize--;
            return  x;
        }
    }

    public  int front(){
        if(queueSize==0){
            System.out.println("Queue is Empty");
            return -1;
        }else {
            return  nums[front];
        }

    }

    public  int rear(){
        if(queueSize==0){
            System.out.println("Queue is Empty");
            return -1;
        }else {
            return  nums[rear];
        }

    }
}
