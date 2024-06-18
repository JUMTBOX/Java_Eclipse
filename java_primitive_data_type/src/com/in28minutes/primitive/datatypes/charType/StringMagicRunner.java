package com.in28minutes.primitive.datatypes.charType;

public class StringMagicRunner {

	public static void main(String[] args) {

		int result = StringMagic.countUppercaseLetters("HELLO");
		System.out.println("결과는 " + result);

		boolean result2 = StringMagic.hasConsecutiveDuplicates("Worlds");
		System.out.println("결과는2?   " + result2);

		int result3 = StringMagic.getRightmostDigit("I bought 5 apples, 4 bananas, and 3 oranges");
		System.out.println("결과는3?   " + result3);

		String result4 = StringMagic.findLongestWord("This is a test sentence");
		System.out.println("결과는4?   " + result4);
	}

}
