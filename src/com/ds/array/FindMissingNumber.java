package com.ds.array;

public class FindMissingNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9 };
		System.out.println(findMissingNumber(arr));
		System.out.println(findMissingXOR(arr));
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("max so far -->" + maxSubArray(a));
	}

	public static int findMissingNumber(int[] arr) {
		int n = arr[arr.length - 1];
		int sum = n * (n + 1) / 2;
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum = arrSum + arr[i];
		}
		return (sum - arrSum);
	}

	public static int findMissingXOR(int[] arr) {
		int arrXOR = arr[0];
		int valueXor = 1;
		for (int i = 1; i < arr.length; i++) {
			arrXOR = arrXOR ^ arr[i];
		}
		for (int i = 2; i <= arr[arr.length - 1]; i++) {
			valueXor = valueXor ^ i;
		}
		return (arrXOR ^ valueXor);
	}

	public static int maxSubArraySum(int[] arr) {
		int size = arr.length;
		int max_so_far = arr[0];
		int current_max = arr[0];
		for (int i = 1; i < size; i++) {
			current_max = Math.max(arr[i], current_max + arr[i]);
			max_so_far = Math.max(max_so_far, current_max);
		}
		return max_so_far;

	}

	static int maxSubArray(int[] a) {

		int size = a.length;

		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			// { -2, -3, 4, -1, -2, 1, 5, -3 };
			max_ending_here = max_ending_here + a[i];
			// -2 +3=1

			System.out.println("max_so_far -->" + max_so_far + " max_ending_here -->" + max_ending_here);
			if (max_so_far < max_ending_here) {
				System.out.println("inside -->" + max_ending_here);
				max_so_far = max_ending_here;
			}
			if (max_ending_here < 0)
				max_ending_here = 0;

		}
		return max_so_far;
	}

	// maximum subarray sum for subarray

	static int maxLeftSubArraySum(int a[], int size, int sum[]) {

		int max_so_far = a[0];
		int curr_max = a[0];
		sum[0] = max_so_far;

		for (int i = 1; i < size; i++) {
			curr_max = Math.max(a[i], curr_max + a[i]);
			max_so_far = Math.max(max_so_far, curr_max);
			sum[i] = max_so_far;
		}
		return max_so_far;
	}

	static int maxRightSubArraySum(int a[], int n, int sum[]) {
		int max_so_far = a[n];
		int curr_max = a[n];
		sum[n] = max_so_far;
		for (int i = n - 1; i >= 0; i--) {
			curr_max = Math.max(a[i], curr_max + a[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}

	static int findMaxAbsDiff(int[] a, int n) {

		int leftMax[] = new int[n];
		maxLeftSubArraySum(a, n, leftMax);
		int rightMax[] = new int[n];
		maxRightSubArraySum(a, n - 1, rightMax);
		int invertArr[] = new int[n];
		for (int i = 0; i < n; i++)
			invertArr[i] = -a[i];
		
		int leftMin[] = new int[n];
		maxLeftSubArraySum(invertArr, n, leftMin);
		for (int i = 0; i < n; i++)
			leftMin[i] = -leftMin[i];
		
		int rightMin[] = new int[n];
		maxRightSubArraySum(invertArr, n - 1, rightMin);
		for (int i = 0; i < n; i++)
			rightMin[i] = -rightMin[i];

		int result = -2147483648;
		for (int i = 0; i < n - 1; i++) {
			int absValue = Math.max(Math.abs(leftMax[i] - rightMin[i + 1]), Math.abs(leftMin[i] - rightMax[i + 1]));
			if (absValue > result)
				result = absValue;
		}

		return result;
	}
}
