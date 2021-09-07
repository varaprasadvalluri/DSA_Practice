package com.ds.stackandgraph;

import java.util.Stack;

public class BalancedBrackets {
	// single stack
	Stack<Character> balancedStack = new Stack<>();

	//
	// public void push(String str) {
	// balancedStack.push(str);
	// }
	public static void main(String[] args) {
		String str = "{[()]}";
		char[] charArray = str.toCharArray();
		String result = "";
		if ((int) str.length() % 2 == 0) {
			result = "yes";
		} else {
			result = "No";
		}
		for (char i = 0; i < charArray.length; i++) {

			if (charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '(') {

			}
		}
	}

}
