package Stacks;

import java.util.Stack;

public class stockPrice {


    public static int[] stocks(int[]stock){

        // Size of arr
        int n = stock.length;
        Stack<Integer> stacks = new Stack<>();
        int[]results =  new int[n];

        for(int i =0;i<n;i++){
            while(!stacks.isEmpty() && stock[stacks.peek()] <= stock[i]){
                stacks.pop();
            }
            results[i] = stacks.isEmpty() ? i + 1 : i - stacks.peek();
            stacks.push(i);
        }
      return results;
    }

    public static void main(String[] args) {
        int[] arr ={100,80,60,70,60,75,85};

        int[]result = stocks(arr);

        for(int c:result){
            System.out.println(c + " ");
        }


    }
}
