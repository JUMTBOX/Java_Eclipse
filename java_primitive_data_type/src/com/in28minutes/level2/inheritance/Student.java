package com.in28minutes.level2.inheritance;

public class Student extends Person {
	private String collegeName;
	private int year;

	Student() {
		super();
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String college_Name) {
		collegeName = college_Name;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
