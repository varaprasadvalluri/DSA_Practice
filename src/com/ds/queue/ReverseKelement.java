package com.ds.queue;

import java.util.LinkedList;

public class ReverseKelement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		reverseQueu(queue, 2);

	}

	public static void reverseQueu(java.util.Queue<Integer> queue, int k) {
		if (k > 0) {
			java.util.Stack<Integer> st = new java.util.Stack<>();
			for (int i = 0; i < k; i++) {
				st.push(queue.remove());
			}
			while (!st.isEmpty()) {
				queue.add(st.pop());
			}
			for (int i = 0; i < queue.size() - k; i++) {
				queue.add(queue.poll());
			}
			System.out.println(queue);
		}

	}
}
