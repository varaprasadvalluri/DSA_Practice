package com.dsapractice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BinerSearch {

    //Alog :

    // [1,2,4,5,7] --> search k=7 -->

    //Step1 --> take mid pointer from Array and dived into two sub arrays

    //Step2 --> search from left- array to find the input if found return the index of that.

    //step 3 --> if left array not found then move the right array --> if found then return the index
    //step 4 : repeate the step 3 and step 4 untill found the index of the input.

    static int findtheIndexPos(int[] arr, int input) {

        int foundPointer = 0;
        if (arr[0] == input) return foundPointer;
        int subArray = arr.length / 2; // 6 /2 -->3 0 -3, 3-6
        int mid = arr[subArray];
        if (foundPointer == input) return foundPointer;
        int[] left = new int[subArray];
        int[] right = new int[subArray];
        for (int i = arr.length - 1; i >= subArray; i--) {
            if (arr[i] == input) return foundPointer;
            else
                right[i] = arr[i];
        }
        for (int i = 0; i < subArray; i++) {
            if (arr[i] == input) return foundPointer;
            else
                left[i] = arr[i];
        }
//still not found then repe

        return foundPointer;
    }


    static int binarySearch(int[] arr, int index) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == index) return mid;
            else if (arr[mid] < index) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    static int getint(int n) {
        System.out.println("inside getint -->"+n);
        if (n == 0 || n == 1 || n == 2) {
            System.out.println("inside n ==0 ");
            return 0;
        }
        if (n == 3) {
            System.out.println("n ==3 inside ");
            return 1;
        }
        else{
            return getint(n - 1) + getint(n - 2) + getint(n - 3);
        }
    }
    static int gg(int ss) {
        int i = 0, sum = 0;
        while (i < 100) {
            sum = sum + i;
            sum = i + sum;
            i += 1;
        }
        return sum;
    }


    public static void main(String[] args) {
//        int[] arr = {1, 10, 20, 3, 5, 6, 7};
//        Scanner sc = new Scanner(System.in);
//        int find = sc.nextInt();
//        Arrays.sort(arr);
//        int result = binarySearch(arr, find);
//        System.out.println("find at -->" + result);
//        StringBuffer bf = new StringBuffer();

        System.out.println("output of 6 -->"+getint(6));

    }
}
