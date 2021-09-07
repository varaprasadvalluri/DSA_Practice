package com.ds.stacke;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingTwoQueue {
	Queue<Integer> q;
	Queue<Integer> tmp;

	/* Constructor */
	public StackUsingTwoQueue() {
		q = new LinkedList<Integer>();
		tmp = new LinkedList<Integer>();
	}

	/* Function to push an element to the stack */
	public void push(int data) {
		/*
		 * if no element is present in queue q then enqueue the new element into q
		 */
		if (q.size() == 0)
			q.add(data);
		else {
			/*
			 * if elements are present in q then dequeue all the elements to temporary queue
			 * tmp
			 */
			int l = q.size();
			for (int i = 0; i < l; i++)
				tmp.add(q.remove());
			/* enqueue the new element into q */
			q.add(data);
			/*
			 * dequeue all the elements from temporary queue tmp to q
			 */
			for (int i = 0; i < l; i++)
				q.add(tmp.remove());
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

	/* Function to display the status of the stack */
	public void display() {
		System.out.print("\nStack = ");
		int l = getSize();
		if (l == 0)
			System.out.print("Empty\n");
		else {
			Iterator it = q.iterator();
			while (it.hasNext())
				System.out.print(it.next() + " ");
			System.out.println();
		}
	}
}
