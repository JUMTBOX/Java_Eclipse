package com.in28minutes.ArraysAndLists;

import java.util.Arrays;

public class ArraysRunner {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Arrays.fill(arr, 10);

		System.out.println(Arrays.toString(arr));

		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = { 1, 2, 3 };
		System.out.println("has same values??? " + Arrays.equals(arr2, arr3));
	}

}
