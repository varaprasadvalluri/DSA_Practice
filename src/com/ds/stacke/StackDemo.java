package com.ds.stacke;

public class StackDemo {
	public static void main(String[] args) {

		/*
		 * Stacke theStack=new Stacke(5); theStack.push(20); // push items onto stack
		 * theStack.push(40); theStack.push(60); theStack.push(80); theStack.push(100);
		 * System.out.println(theStack.pop());
		 */

		/*
		 * while( !theStack.isEmpty()){ System.out.println(theStack.pop()); }
		 */

		Stacke stack = new Stacke(3);

		stack.push(1);
		stack.push(2);
		stack.push(3);

		/*
		 * System.out.println("Before pop"); System.out.println(stack.top);
		 */

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
