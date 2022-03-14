package com.te.javabasics.common;

import java.util.Scanner;

public class PatternAlpha {
	public static void main(String[] args) {

		int alphabet = 65;

		for (int i = 0; i <= 3; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println("");

		}
	}

}
