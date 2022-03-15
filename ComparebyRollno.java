package com.te.Comparator.Assignment;

import java.util.Comparator;

public class ComparebyRollno implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.rollno-o2.rollno;
	}

}
