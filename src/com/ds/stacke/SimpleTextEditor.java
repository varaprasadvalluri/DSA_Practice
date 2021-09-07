package com.ds.stacke;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
	public static void main(String srgs[]) {

		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		Stack stack = new Stack();
		String currentString = "";

		for (int x = 0; x < limit; x++) {
			int ope = sc.nextInt();
			switch (ope) {
			case 1: // append
				stack.push(currentString);
				String append = sc.next();
				currentString += append;
				break;
			case 2: // erase last x characters
				stack.push(currentString);
				int character = sc.nextInt();
				currentString = currentString.substring(0, currentString.length() - character);
				break;
			case 3: // print
				int index = sc.nextInt();
				System.out.println(currentString.charAt(index - 1));
				break;
			case 4: // undo
				currentString = (String) stack.pop();
				break;
			default:
				break;
			}
		}
	}
}
