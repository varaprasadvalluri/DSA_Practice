package com.ds.array;

public class FindTriplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 1, 2, 3, 4, 6, 6, 4, 4 };

		int triplicate = arr[0];
		for (int i = 1; i < arr.length; i++) {
			triplicate = triplicate ^ arr[i];

		}
		System.out.println("Triplicate is : " + triplicate);

	}
}
