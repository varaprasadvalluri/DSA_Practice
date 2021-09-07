package com.ds.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 6, 1, 8 };
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		
		String str="Hello";
		String str1=new String("Hello");
		System.out.println("-->"+str==str1);
		
	}

	public static void insertionSort(int[] arr) {
		int i, j, temp;
		for (i = 1; i <= arr.length - 1; i++) {
			j = i;
			int v = arr[i];
			while (j >= 1 && arr[j - 1] > v) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = v;
		}
	}

	public static void insertionSortWhile(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && current < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			// at this point we've exited, so j is either -1
			// or it's at the first element where current >= a[j]
			array[j + 1] = current;
		}
	}
}
