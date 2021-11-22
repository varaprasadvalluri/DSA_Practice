package com.dsapractice;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing1Queue {

    Queue<Integer> queue = new LinkedList<>();

    public void push(int data) {
        int size = queue.size();
        queue.offer(data);//Enqueue
        for (int i = 0; i < size; i++) {
            int lastdata = queue.poll();//Dequeue
            queue.offer(lastdata);
        }
    }

    public int peek() {
        if (empty()) return -1;
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public int pop() {
        if (empty()) {
            System.out.println("stack is empty");
            return -1;

        }
        return queue.poll();
    }

    public static void main(String[] args) {
        StackUsing1Queue stack = new StackUsing1Queue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("stack data --->" + stack.peek());
        stack.pop();
        System.out.println("stack data --->" + stack.peek());
        stack.pop();
        System.out.println("stack data --->" + stack.peek());
        stack.pop();
        System.out.println("stack data --->" + stack.peek());
    }
}
