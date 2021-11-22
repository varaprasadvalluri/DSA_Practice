
package com.dsapractice;

import java.util.Scanner;
import java.util.Stack;

public class HackerRankATaleofTwoStacks<T> {

    Stack<T> q1;
    Stack<T> q2;

    HackerRankATaleofTwoStacks() {
        q1 = new Stack<T>();
        q2 = new Stack<T>();
    }

    protected void enqueue(T t) {
        q1.push(t);
    }

    protected void dequeue() {
        if (q2.isEmpty()) {
            while (!q1.isEmpty()) {
                q2.push(q1.pop());
            }
        }
        q2.pop();
    }

    protected T peek() {
        if (q2.isEmpty()) {
            while (!q1.isEmpty()) {
                q2.push(q1.pop());
            }
        }
        return q2.peek();
    }

    public static void main(String[] args) {
        HackerRankATaleofTwoStacks<Integer> queue = new HackerRankATaleofTwoStacks<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

