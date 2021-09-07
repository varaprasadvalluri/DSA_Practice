package com.ds.stacke;

import java.util.Scanner;

public class EqualStack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		java.util.Stack st1 = new java.util.Stack();
		java.util.Stack st2 = new java.util.Stack();
		java.util.Stack st3 = new java.util.Stack();
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int h1[] = new int[n1];
		for (int h1_i = 0; h1_i < n1; h1_i++) {
			h1[h1_i] = in.nextInt();
			sum1 = sum1 + h1[h1_i];
		}
		int h2[] = new int[n2];
		for (int h2_i = 0; h2_i < n2; h2_i++) {
			h2[h2_i] = in.nextInt();
			sum2 = sum2 + h2[h2_i];
		}
		int h3[] = new int[n3];
		for (int h3_i = 0; h3_i < n3; h3_i++) {
			h3[h3_i] = in.nextInt();
			sum3 = sum3 + h3[h3_i];
		}

		for (int i = (n1 - 1); i >= 0; i--) {
			st1.push(h1[i]);
		}
		for (int j = (n2 - 1); j >= 0; j--) {
			st2.push(h2[j]);
		}
		for (int k = (n3 - 1); k >= 0; k--) {
			st3.push(h3[k]);
		}

		while (true) {
			if (sum1 > sum2 || sum1 > sum3) {
				sum1 = sum1 - (int) st1.pop();
			} else if (sum2 > sum1 || sum2 > sum3) {
				sum2 = sum2 - (int) st2.pop();
			} else if (sum3 > sum1 || sum3 > sum1) {
				sum3 = sum3 - (int) st3.pop();
			} else {
				break;
			}
		}
		System.out.println(sum1);
	}
}
