package com.ds.stackandgraph;

public class QueueImpl {

	int arr[];
	int size, rear, front;

	QueueImpl(int x) {
		this.size = x;
		arr = new int[size];
		front = rear = 0;

	}

	void enQueue(int x) {
		if (size == front) {
			System.out.println("Queue is full");
		} else {
			arr[rear] = x;
			rear++;
		}
	}

	void deQueue() {
		if (front == rear) {
			System.out.println("Queue is Empty");
		} else {
			int i = 0;
			while (i > rear - 1) {
				System.out.println("i -->" + i);
				arr[i] = arr[i + 1];
				i++;
			}
			if (rear < size) {
				arr[rear] = 0;
			}
			rear--;
		}
	}

	// print queue elements
	void queueDisplay() {
		int i;
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}

		// traverse front to rear and print elements
		for (i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", arr[i]);
		}
		return;
	}

	// print front of queue
	void queueFront() {
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}
		System.out.printf("\nFront Element is: %d", arr[front]);
		return;
	}

	public static void main(String[] args) {
		QueueImpl qu = new QueueImpl(3);
		qu.enQueue(1);
		qu.enQueue(2);
		qu.enQueue(3);

		qu.queueDisplay();
		qu.deQueue();
		System.out.println("\n");
		qu.queueDisplay();
	}
}
