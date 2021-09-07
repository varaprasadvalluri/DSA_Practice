package com.ds.queue;

import java.util.NoSuchElementException;

public class StackUsingOneQeue {
	Queue q;

	public StackUsingOneQeue(int n) {
		q = new Queue(n);
	}

	public void push(int data) {

		if (q.nElement == 0) {
			q.insert(data);

		} else {
			int size = q.nElement;
			q.insert(data);
			for (int i = 0; i < size; i++) {
				int d = q.remove();
				q.insert(data);

			}
		}
	}

	public int pop() {
		if (q.maxsize == 0)
			throw new NoSuchElementException("Underflow Exception");
		return q.remove();
	}

	/* Function to check if stack is empty */
	public boolean isEmpty() {
		return q.maxsize == 0;
	}

	/* Function to get the size of the stack */
	public int getSize() {
		return q.maxsize;
	}
}
