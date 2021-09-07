
package com.ds.sorting;
import java.util.Arrays;


public class BubSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,2};
		//bubbleSort(arr);
		selectionSort(arr);
	for ( int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
		
	}
	
	public static void bubbleSort(int [] arr){
		boolean swap = true;
		for ( int i =arr.length-1;i>=0 && swap;i--){
			swap = false;

			for ( int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					swap = true;
				}
			}
			System.out.println("Swap value " + swap);
		}
	}
	
	
	public static void selectionSort(int [] arr){
		
		for ( int i =0;i<arr.length;i++){
			int min = i;
			for ( int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min = j;
				}
				int temp = arr[i];
				arr[i]= arr[min];
				arr[min] = temp;
			}
		}
	}
	

}
