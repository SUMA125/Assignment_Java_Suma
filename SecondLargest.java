package com.te.ArrayAsiignment.sort;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int temp = 0;
		int arr[] = { 5, 250, 250, 150, 25, 7 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int k = arr.length - 1; k >= 0; k--) {
			if (arr[k - 1] != arr[k]) {
				System.out.println("Second Largest element is :" + arr[k - 1]);
				break;
			}
		}

//		  for (int k = arr.length - 2; k >= 0; k--) { if (arr[k]>arr[arr.length-1]) {
//		  System.out.println("Second Smallest number is :"+arr[k]); return; }
//		  
//		  }
//		 
	}
}
