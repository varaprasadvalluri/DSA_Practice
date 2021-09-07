package com.ds.array;

public class ReverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4 };
		reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void reverse(int[] arr) {
		int first = 0;
		int last = arr.length - 1;
		int temp = 0;
		while (first < last) {
			temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;

		}
	}
}
