package com.in28minutes.ArraysAndLists;

public class TestRunner {

	public static void main(String[] args) {
		int[] arg1 = { 5, 5, 5, 4, 4 };
		int[] arg2 = { 2, 2, 2, 2, 2 };

		ArrayMagic am = new ArrayMagic();
		BiArray bi = new BiArray(arg1, arg2);
		
		int result = am.findSecondLargestElement(arg1);
		System.out.println(result);

		System.out.println("sorted?   " + am.isSorted(arg2));
		am.reverseArray(arg1);
	}

}
