package Stacks;

import java.util.Stack;

public class inflixToprifix {
    public static int priority(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':

                return 3;

        }

        return -1;
    }

    public static boolean operator(char ch){
        return  (ch >'A' && ch < 'Z') || (ch >'a' && ch < 'z') || (ch >'0' && ch < '9');
    }
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        StringBuilder post = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char ch : exp.toCharArray()){
            if(operator(ch)){
                post.append(ch);
            }else if(ch=='('){
                stack.push('(');
            }else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    post.append(stack.pop());
                }
                stack.pop();
            } else {
                while(!stack.isEmpty() && priority(stack.peek())>= priority(ch)){
                    post.append(stack.pop());
                }
                stack.pop();
            }

            while(!stack.isEmpty()){
                post.append(stack.pop());
            }
        }

        return post.toString();
    }

}