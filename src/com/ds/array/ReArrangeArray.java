package com.ds.array;

import java.util.Stack;

public class ReArrangeArray {

	public static void main(String[] str) {

		int[] arra = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(arra[0]);
		for (int index = 0; index < arra.length; index++) {
			System.out.println("index-->" + arra[index] + ">  stack is -->" + stack.peek());
			// first we have to find the index is present at out array

		}

		while (!stack1.isEmpty()) {
			System.out.println("stack -->" + stack1.peek());
			stack1.pop();
		}
	}

}
