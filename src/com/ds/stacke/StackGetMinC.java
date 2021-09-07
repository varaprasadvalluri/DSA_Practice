package com.ds.stacke;

import java.util.Stack;

public class StackGetMinC {
	Stack<Integer> st1 = new Stack<>();
	Stack<Integer> minStack = new Stack<>();

	public void push(int data) {
		if (st1.isEmpty()) {
			st1.push(data);
			minStack.push(data);
		} else {
			st1.push(data);
			if (data < minStack.peek()) {
				minStack.push(data);
			}
		}

	}

	public int pop() {
		int data = st1.pop();
		if (data == minStack.peek()) {
			data = minStack.pop();
		}
		return data;
	}

	public int getMin() {
		return minStack.peek();
	}

	public static void main(String[] args) {
		StackGetMinC st = new StackGetMinC();
		int[] arr = { 8, 9, 1, 5, 0, 10 };
		for (int i : arr) {
			st.push(i);
		}
		st.pop();
		st.pop();
		System.out.println(st.getMin());
	}
}
