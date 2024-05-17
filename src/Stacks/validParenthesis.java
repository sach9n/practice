package Stacks;

import java.util.Stack;

public class validParenthesis {

    public static boolean validParentheses(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) return false;

                switch (ch) {
                    case ')':
                        if (st.pop() != '(') return false;
                        break;
                    case '}':
                        if (st.pop() != '{') return false;
                        break;
                    case ']':
                        if (st.pop() != '[') return false;
                        break;
                }
            } else {
                st.add(ch);
            }

        }
        return st.isEmpty();
    }
}