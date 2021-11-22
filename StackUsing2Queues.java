package com.dsapractice;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
    private static Queue<Integer> queue1 = new LinkedList<>();
    private static Queue<Integer> queue2 = new LinkedList<>();
    static int curSize;

    StackUsing2Queues() {
        curSize = 0;
    }

    public void push(int x) {
        curSize++;
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.peek());
            queue1.poll();
        }
        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
    }

    //peek is nothing but top
    public int top() {
        if (queue1.isEmpty()) return -1;
        return queue1.peek();
    }

    public static void pop() {
        if (queue1.isEmpty()) return;
        queue1.poll();
        curSize--;
    }

    public int size() {
        return this.curSize;
    }

    public void print() {
        while (!queue1.isEmpty()) {
            System.out.println("queue -->" + queue1.peek());
            queue1.poll();
        }
    }

    public static void main(String[] args) {
        StackUsing2Queues s = new StackUsing2Queues();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("current size -->" + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());

    }
}
