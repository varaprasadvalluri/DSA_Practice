package com.dsapractice;

import java.util.Stack;

public class QueueUsing2Stack<T> {

    //It is exceeding the time complexity while run the Hacke rank program
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void enQueue(int data) {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    int peek() {
        if (empty()) return -1;
        return (int) stack1.peek();
    }

    int dequeue() {
        if (empty()) return -1;
        return (int) stack1.pop();
    }

    boolean empty() {
        return stack1.empty();
    }

    public static void main(String[] args) {
        QueueUsing2Stack<Integer> queque = new QueueUsing2Stack<Integer>();
        queque.enQueue(1);
        queque.enQueue(2);
        System.out.println("queue -->" + queque.peek());
        queque.dequeue();
        System.out.println("queue -->" + queque.peek());
        queque.dequeue();
    }

}
