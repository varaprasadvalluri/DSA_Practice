package com.ds.array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7 };
		// int n =removeDuplicateExtraSpace(arr);
		int n = removeDuplicate(arr);

		for (int i = 0; i <= n; i++) {
			System.out.println(arr[i]);
		}

		// removeDuplicate(arr);
	}
	//userName 

	// datastrucre 
	public static int removeDuplicateExtraSpace(int[] arr) {

		int[] tempArr = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				tempArr[j++] = arr[i];
			}

		}
		tempArr[j] = arr[arr.length - 1];

		/*
		 * for ( int i=0;i<tempArr.length;i++){ System.out.println(tempArr[i]); }
		 */

		for (int i = 0; i <= j; i++) {
			arr[i] = tempArr[i];
		}
		return j;
	}

	public static int removeDuplicate(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}

		}
		arr[j] = arr[arr.length - 1];
		return j;
	}

}
