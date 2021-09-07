package com.ds.queue;

public class StackUsingOneQDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingOneQeue st = new StackUsingOneQeue(20);
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.pop());
		System.out.println(st.pop());

	}
}
