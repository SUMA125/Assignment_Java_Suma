package com.te.ArrayAsiignment.sort;

import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args) {

		int numbers[] = new int[] { 10, 20, 30,50, 40, 50 };

		int max = numbers[0];
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			} else if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("largest Number in the array is :" + max);
		System.out.println("Smallest Number in the array is :" + min);

	}

}
