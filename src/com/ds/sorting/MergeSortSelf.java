package com.ds.sorting;

public class MergeSortSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 4, 2, 8, 10, 5 };
		mergeSort(arr, 0, arr.length - 1);
		printArray(arr);
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;

			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);

			// Merge the sorted halves
			merge(arr, l, mid, r);
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub

		int n1 = mid - l + 1;
		int n2 = r - mid;

		int[] left = new int[n1];
		int[] right = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			left[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			right[j] = arr[mid + 1 + j];
		int i = 0, j = 0;
		int k = l;

		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

}
