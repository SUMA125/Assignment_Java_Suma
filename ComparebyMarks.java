package com.te.Comparator.Assignment;

import java.util.Comparator;

public class ComparebyMarks implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return (int) (o1.marks-o2.marks);
	}

}
