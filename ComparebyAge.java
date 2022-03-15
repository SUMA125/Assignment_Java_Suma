package com.te.Comparator.Assignment;

import java.util.Comparator;

public class ComparebyAge implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.age-o2.age;
	}

}
