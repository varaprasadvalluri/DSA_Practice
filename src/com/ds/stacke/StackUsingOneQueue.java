package com.ds.stacke;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingOneQueue {
	Queue<Integer> q;

	public StackUsingOneQueue() {
		q = new LinkedList<Integer>();
	}

	public void push(int data) {

		if (q.size() == 0) {
			q.add(data);

		} else {
			int size = q.size();
			q.add(data);
			for (int i = 0; i < size; i++) {
				int d = q.remove();
				q.add(d);

			}
		}
	}

	/* Function to remove top element from the stack */
	public int pop() {
		if (q.size() == 0)
			throw new NoSuchElementException("Underflow Exception");
		return q.remove();
	}

	/* Function to check the top element of the stack */
	public int peek() {
		if (q.size() == 0)
			throw new NoSuchElementException("Underflow Exception");
		return q.peek();
	}

	/* Function to check if stack is empty */
	public boolean isEmpty() {
		return q.size() == 0;
	}

	/* Function to get the size of the stack */
	public int getSize() {
		return q.size();
	}
}
