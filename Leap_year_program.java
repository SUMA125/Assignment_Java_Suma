package com.te.javabasics.common;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year :");
		int year = scanner.nextInt();
		System.out.println("Enter the month:");
		int month = scanner.nextInt();
		
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	switch (month){
	case 1:
		System.out.println("January month- 31 days");
		break;
	case 2:
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("February month- 29 days");
		} else {
			System.out.println("February month- 28 days");
		}
		break;
	case 3:
		System.out.println("March month _- 31 days");
		break;
	case 4:
		System.out.println("April month - 30 days");
		break;
	case 5:
		System.out.println("May month- 31 days");
		break;
	case 6:
		System.out.println("June month _- 30 days");
		break;
	case 7:
		System.out.println("July month - 31 days");
		break;
	case 8:
		System.out.println("August month _- 31 days");
		break;
	case 9:
		System.out.println("September month - 30 days");
		break;
	case 10:
		System.out.println("October month- 31 days");
		break;
	case 11:
		System.out.println("November month _- 30 days");
		break;
	case 12:
		System.out.println("December month - 31 days");
		break;
	
	default:
		System.out.println("Invalid input");		

}	
	}
}
