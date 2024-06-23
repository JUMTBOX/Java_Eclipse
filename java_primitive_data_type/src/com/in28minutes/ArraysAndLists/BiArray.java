package com.in28minutes.ArraysAndLists;

public class BiArray {

	private int[] array1;
	private int[] array2;

	public BiArray(int[] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}

	public boolean areSumsEqual() {

		int sum1 = calculateSum(array1);
		int sum2 = calculateSum(array2);

		return sum1 == sum2;
	}

	private int calculateSum(int[] array) {
		int result = 0;
		
		for (int el : array) {
			result += el;
		}

		return result;
	}
}
