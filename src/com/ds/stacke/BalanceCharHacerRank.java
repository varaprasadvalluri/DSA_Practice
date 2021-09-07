package com.ds.stacke;

public class BalanceCharHacerRank {
	public static void main(String[] args) {

		boolean answer = false;
		String s = "{()]";
		java.util.Stack st = new java.util.Stack();

		for (int j = 0; j < s.length(); j++) {

			char chr = s.charAt(j);
			if (chr == '{' || chr == '(' || chr == '[') {
				st.push(chr);
			}
			if (chr == '}' || chr == ')' || chr == ']') {
				if (st.isEmpty()) {
					answer = false;
					break;
				}
				int size = st.size();
				char[] incharArr = new char[size];
				char inchar = (char) st.pop();
				answer = checkBalance(chr, answer, inchar);

			}

		}

		answer = answer && st.isEmpty();

		System.out.println(answer);

	}

	static boolean checkBalance(char chr, boolean ans, char inchar) {
		if (chr == ')' && inchar == '(') {
			ans = true;

		} else if (chr == '}' && inchar == '{') {
			ans = true;

		} else if (chr == ']' && inchar == '[') {
			ans = true;

		} else {
			ans = false;
		}

		return ans;
	}
}
