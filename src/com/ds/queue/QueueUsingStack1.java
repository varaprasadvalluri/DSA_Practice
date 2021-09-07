package com.ds.queue;

import java.util.Stack;

public class QueueUsingStack1 {
	Stack<Integer> st1;
	Stack<Integer> st2;

	public QueueUsingStack1() {
		st1 = new Stack<>();
		st2 = new Stack<>();
	}

	public void enqueue(int data) {
		if (st1.isEmpty()) {
			st1.push(data);
		} else {
			while (!st1.isEmpty()) {
				st2.push(st1.pop());
			}
			st1.push(data);
			while (!st2.isEmpty()) {
				st1.push(st2.pop());
			}
		}
	}

	public int dequeue() {
		return st1.pop();
	}

	public static void main(String[] args) {
		QueueUsingStack1 q = new QueueUsingStack1();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}
}
