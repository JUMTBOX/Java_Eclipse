package com.in28minutes.ArraysAndLists;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private int[] marks;

	Student(String name, int... makrs) {
		this.name = name;
		this.marks = makrs;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int max = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (max < mark) {
				max = mark;
			}
		}
		return max;
	}

	public int getMinimumMark() {
		int min = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (min > mark) {
				min = mark;
			}
		}
		return min;
	}

	public BigDecimal getAverageMarks() {
		int sum = this.getTotalSumOfMarks();
		int number = this.getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

}
