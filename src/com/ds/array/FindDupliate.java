package com.ds.array;

public class FindDupliate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 6, 7 };
		System.out.println(findDupilcate(arr));
	}

	public static int findDupilcate(int[] arr) {
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum = arrSum + arr[i];
			//System.out.println("arrsum -->"+arrSum);
		}
		int n = arr[arr.length - 1];
		//System.out.println("n -->"+(n*(n+1)));
		int numberSum = n * (n + 1) / 2;
		System.out.println(numberSum);
		return arrSum - numberSum;
	}
}
