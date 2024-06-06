package com.in28minutes.primitive.datatypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		Binumber numbers = new Binumber(2, 3);
		System.out.println("더하기 " + numbers.add());
		System.out.println("곱하기 " + numbers.multiply());
		numbers.doubles();
		System.out.println("숫자1 " + numbers.getNum1());
		System.out.println("숫자2 " + numbers.getNum2());
	}

}
