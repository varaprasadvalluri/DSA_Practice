package com.dsapractice;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        //
        int[] arr = {4, 2, 5, 1, 3};
        sort(arr);
        System.out.println("after sort -->" + Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int curentIndex = arr[i] - 1;
            System.out.println("curentIndex -->" + curentIndex);
            if (arr[i] != arr[curentIndex])
                swap(arr, i, curentIndex);
            else i++;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reverseArray(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            swap(arr, i, arr.length);
        }
    }
}
