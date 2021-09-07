package com.ds.queue;

public class Queue {
	private int front;
	private int rear;
	int[] queueArray;
	int maxsize;
	int nElement;

	public Queue(int n) {

		front = 0;
		rear = -1;
		queueArray = new int[n];
		maxsize = n;
		nElement = 0;
	}

	public void insert(int data) {

		queueArray[++rear] = data;
		nElement++;
	}

	public int remove() {
		return queueArray[front++];

	}

	public boolean isEmpty() {
		return (rear == -1);
	}

	public boolean isFull() {
		return (rear == (maxsize - 1));
	}
}
