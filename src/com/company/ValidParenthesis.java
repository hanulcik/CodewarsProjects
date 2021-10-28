package com.company;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean validParenthesis(String parens) {
        Stack<Character> stack = new Stack<>();
        char[] ch = new char[parens.length()];
        if (parens.length() == 1)
            return false;

        for (int i = 0; i < parens.length(); i++) ch[i] = parens.charAt(i);

        for (char c : ch) {
            if (c == '(') stack.push(c);
            if (stack.isEmpty() && c == ')') return false;
            if (c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                    continue;
                }
                else return false;
            }
        }

        if (stack.isEmpty()) return true;
        return false;
    }
}
