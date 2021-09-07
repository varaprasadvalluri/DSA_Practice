package com.ds.array;

public class MaxContigousSum {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int totalSum = Integer.MIN_VALUE, curentSum = 0;

		for (int i = 0; i < size; i++) {
			curentSum = curentSum + a[i];
			if (totalSum < curentSum)
				totalSum = curentSum;
			if (curentSum < 0)
				curentSum = 0;
		}
		return totalSum;
	}
}
