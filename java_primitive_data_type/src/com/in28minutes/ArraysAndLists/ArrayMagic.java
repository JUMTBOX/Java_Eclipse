package com.in28minutes.ArraysAndLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayMagic {

	/**
	 * This method determines whether there's an element greater than a given number
	 * in an array.
	 *
	 * @param array  The array to search through.
	 * @param number The number to compare with the array elements.
	 * @return True if there's an element greater than the given number in the
	 *         array, false otherwise.
	 */
	public boolean doesHaveElementGreaterThan(int[] array, int number) {

		if (array.length == 0) {
			return false;
		}

		for (int el : array) {
			if (el > number) {
				return true;
			}
		}

		return false;
	}

	public int findSecondLargestElement(int[] array) {
		if (array.length == 0) {
			return -1;
		}

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int val : array) {
			if (val > max) {
				secondMax = max;
				max = val;
			} else if (val > secondMax && val != max) {
				secondMax = val;
			}
		}

		if (secondMax == Integer.MIN_VALUE) {
			return -1;
		}

		return secondMax;
	}

	public boolean isSorted(int[] array) {

		if (array.length < 2) {
			return true;
		}
		int bef = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				bef = array[i - 1];
				if (array[i] < bef) {
					return false;
				}
			} else {
				continue;
			}
		}
		return true;
	}

	public int[] reverseArray(int[] array) {
		int[] result = new int[array.length];
		int idx = 0;
		for(int i = array.length - 1; i >=0; i--) {
			result[idx] = array[i];
			idx++;
		}

		return result;
	}

	public List<Integer> determineAllFactors(int number) {
		List<Integer> result = new ArrayList<>();

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				result.add(i);
			}
		}

		return result;
	}

	public List<Integer> determineMultiples(int number, int limit) {
		List<Integer> result = new ArrayList<>();

		if (number <= 0 || limit <= 0) {
			return result;
		}

		for (int i = 1; number * i < limit; i++) {
			result.add(number * i);
		}

		return result;
	}
}