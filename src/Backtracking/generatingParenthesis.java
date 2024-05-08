package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class generatingParenthesis {


    public static void generateParentheses(String curr, int diff,int num){
        if(curr.length()==2*num && diff==0){
            System.out.println(curr);
            return;
        }

        if(curr.length()==2*num || diff<0){
            return;
        }

        // build the method
        generateParentheses(curr+"(", diff+1, num);

        generateParentheses(curr+")",diff-1,num);


    }

    public static void main(String[] args) {
      int num = 8;
      generateParentheses("",0,num);
    }
}

