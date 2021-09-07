package com.ds.queue;

import java.util.LinkedList;

public class ReverseQueue {
	public static void main(String args[]) {
		java.util.Queue<Integer> queue = new LinkedList<>();

		queue.add(1);
		queue.add(2);
		queue.add(3);

		System.out.println(queue.peek());
		queue = reverseQueue(queue);
		System.out.println(queue.peek());

	}

	private static java.util.Queue<Integer> reverseQueue(java.util.Queue<Integer> qt) {
		java.util.Stack<Integer> st = new java.util.Stack<>();
		while (!qt.isEmpty()) {
			st.push(qt.remove());
		}
		while (!st.isEmpty()) {
			qt.add(st.pop());
		}
		return qt;
	}
}
