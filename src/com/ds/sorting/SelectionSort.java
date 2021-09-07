package com.ds.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 6, 1, 8 };
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void selectionSort(int[] arr) {
		int len, temp, i, j, min;
		len = arr.length;
		for (i = 0; i < len; i++) {
			min = i;
			for (j = i + 1; j < len; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}

			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	public static void selectionSortTemp(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minId = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minId = j;
				}
			}
			// swapping
			int temp = array[i];
			array[i] = min;
			array[minId] = temp;
		}
	}

}
