package com.gg.leetcode;

import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                if ((ch == ')' && stack.peek() == '(')
                        || ((ch == '}' && stack.peek() == '{'))
                        || (ch == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
