package com.in28minutes.ArraysAndLists;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 97, 98, 100 };
		Student student = new Student("Ranga", marks);

		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int max = student.getMaximumMark();
		int min = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();

		System.out.println("과목수:  " + number);
		System.out.println("점수 총합:  " + sum);
		System.out.println("최대점수:  " + max);
		System.out.println("최소점수:  " + min);
		System.out.println("평균점수:  " + average);
	}

}
