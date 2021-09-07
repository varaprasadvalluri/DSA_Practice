package com.ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, 6, 1, 8 };
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void BubbleSort(int[] arr) {
		int len = arr.length;
		for (int i = len - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

	}
//Asce
	public static void BubbleSortImproved(int[] arr) {
		int len = arr.length;
		boolean swapped = true;
		for (int i = len - 1; i >= 0 && swapped; i--) {//{10,30,40}
			swapped = false;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;

				}
			}
		}

	}

	public static void bubbleSort(int[] a) {
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}
}
