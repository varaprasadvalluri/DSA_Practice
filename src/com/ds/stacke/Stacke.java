package com.ds.stacke;

public class Stacke {
	int maxSize;
	double[] stackArray;
	int top;

	public Stacke(int size) {

		maxSize = size;
		stackArray = new double[size];
		top = -1;
	}

	public void push(double j) {
		stackArray[++top] = j;
	}

	public double pop() {
		return stackArray[top--];

	}

	public double peek() {
		return stackArray[top];

	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}
}
