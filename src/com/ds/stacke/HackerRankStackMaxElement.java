package com.ds.stacke;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class HackerRankStackMaxElement {
	public static void main(String args[]) {
		Stack<Integer> st = new Stack();
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			int data = sc.nextInt();
			if (data == 1) {
				st.push(sc.nextInt());
			} else if (data == 2) {
				st.pop();
			} else {
				System.out.println(findMax(st));
			}

		}
	}

	private static int findMax(Stack st) {
		TreeSet<Integer> tree = new TreeSet<>();
		while (!st.isEmpty()) {
			tree.add((Integer) st.pop());
		}
		int size = tree.size();
		int result = 0;
		result = tree.pollLast();
		// return tree.pollLast();

		return result;
	}
}
