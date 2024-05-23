package Stacks;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArraysImplementation {



    static class implementation{
        int [] arr = new int[10000];
        int top = -1;
        // push
        void push(int x){
            arr[++top] = x;
        }

        int pop(){
            return  arr[top--];
        }

        int top(){
            return  arr[top];
        }

        boolean isEmpty(){
            return top == -1;
        }

        int size(){
            return top+1;
        }



    }

}

    class QueueImpolementation {

      Queue<Integer> que = new ArrayDeque<>();

      public static void push(){
          for(int i = 0; i < )
        }
    }