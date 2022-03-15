package com.te.Comparator.Assignment;

import java.util.Comparator;

public class ComparebyAddress implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.address.compareTo(o2.address);
	}

}
