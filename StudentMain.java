package com.te.Comparator.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.te.javabasics.collections.Employee;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();

		arr.add(new Student("Ajay", 10, 60.55, 24, "Bangalore"));
		arr.add(new Student("Suma", 14, 85.12, 25, "Mysore"));
		arr.add(new Student("Seema", 20, 70.5, 22, "Chennai"));
		arr.add(new Student("Ganavi", 18, 71.5, 21, "mumbai"));
		arr.add(new Student("Shivani", 5, 90.55, 20, "Hydarabad"));

		// System.out.println(arr);

		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("Enter 1 to sort by Name");
			System.out.println("Enter 2 to sort by Rollno");
			System.out.println("Enter 3 to sort by Marks");
			System.out.println("Enter 4 to sort by Age");
			System.out.println("Enter 5 to sort by Address");
			int option = scanner.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Sorting by name:");
				Collections.sort(arr, new CompareByName());
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
			}
			case 2: {
				System.out.println("Sorting by Rollno:");
				Collections.sort(arr, new ComparebyRollno());
				for (Student student : arr) {
				System.out.println(student);
				}
				break;
			}
			case 3: {Collections.sort(arr, new ComparebyMarks());
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
			}
			case 4:{Collections.sort(arr, new ComparebyAge());
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
			}
			case 5:{Collections.sort(arr, new ComparebyAddress());
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
			}
			default:
				System.out.println("Enter option 1 to 5 only");
			}
			Scanner sc = new Scanner(System.in);

			System.out.println();
			System.out.println("If you wish to continue- Type YES");
			System.out.println("To Quit- Type NO");
			String str = sc.next();
			if (str.equalsIgnoreCase("yes")) {
				flag = true;
			} else if (str.equalsIgnoreCase("no")) {
				flag = false;
				System.out.println("Program Terminated");
			} else {
				System.out.println("Error!!!: Please type only YES or NO");
			}
		} while (flag==true);

	}// main
}// class
