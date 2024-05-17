package Stacks;

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
