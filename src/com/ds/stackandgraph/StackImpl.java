package com.ds.stackandgraph;

public class StackImpl {

	int arr[];
	int index = 0, size;

	StackImpl(int x) {
		this.size = x;
		arr = new int[size];
	}

	void push(int x) {
		if (!isFull()) {
			arr[index] = x;
			index++;
		} else
			System.out.println("stack is overflow");
	}

	int peek() {
		return index;
	}

	void pop() {
		if (!isEmpty()) {
			index--;
		} else {
			System.out.println("stack is empty");
		}
	}

	boolean isEmpty() {
		if (index == 0)
			return true;
		else
			return false;
	}

	boolean isFull() {
		if (index == size)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		StackImpl st = new StackImpl(4);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		while (!st.isEmpty()) {
			int data = st.peek();
			System.out.println("data -->" + data);
			st.pop();
		}
	}
}
