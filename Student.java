package com.te.Comparator.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

import com.te.javabasics.collections.Employee;

public class Student {
	String name;
	int rollno;
	Double marks;
	int age;
	String address;
	public Student(String name, int rollno, Double marks, int age,String address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
		this.address=address;
	}
	@Override
	public String toString() {
		return "Student [name = " + name + ", rollno = " + rollno + ", marks = " + marks + ", age = " + age + ", address = "
				+ address + "]";
	}
	
	
	
	
	

	
}
