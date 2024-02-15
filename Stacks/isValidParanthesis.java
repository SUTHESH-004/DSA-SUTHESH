package Stacks;

import java.util.*;

class isValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        // String b = "[({";
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[')
                stack.push(c);
            else if (!stack.isEmpty()) {
                if (stack.peek() == '(' && c == ')')
                    stack.pop();
                else if (stack.peek() == '{' && c == '}')
                    stack.pop();
                else if (stack.peek() == '[' && c == ']')
                    stack.pop();
                else
                    return false;
            } else
                return false;
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}