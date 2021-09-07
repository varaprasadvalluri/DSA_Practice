package com.ds.stackandgraph;

public class StackExample1 {

	// getMin

	int[] arr;
	int index = 0;

	// push
	// peek
	// pop

	public StackExample1(int size) {
		arr = new int[size];
	}

	public void push(int data) {
		if (data != 0 && !isFull(data)) {
			arr[index++] = data;
		}
	}

	public boolean isFull(int size) {
		if (arr[size++] < arr.length) {
			return true;
		} else
			return false;
	}

	public void pop() {

	}

	public boolean isEmpty() {
		if (arr.length == 0) {
			return true;
		} else
			return false;
	}
}
