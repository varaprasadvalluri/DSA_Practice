package com.practice.dsa.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedStack {

    public static void main(String[] args) {

        Map<Character, Character> isBalancedMap = new HashMap<>();
        isBalancedMap.put('{', '}');
        isBalancedMap.put('[', ']');
        isBalancedMap.put('(', ')');
        String str = "([{{[(())]}}])";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isBalancedMap.containsKey(ch)) {//starting of the character
                stack.push(str.charAt(i));//if its open then push into stack
            } else if (!stack.empty() && ch == isBalancedMap.get(stack.peek())) {
                stack.pop();
            } else {
                System.out.println("stack is unbalanced!");
                return;
            }
        }
        if (!stack.empty())
            System.out.println("Stack is unbalanced!");
        else
            System.out.println("Stack is balaced!");
    }
}
