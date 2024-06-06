package com.in28minutes.primitive.datatypes.charType;

public class MyCharRunner {

	public static void main(String[] args) {

		MyChar myChar = new MyChar('B');

		System.out.println("결과 " + myChar.isVowel());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());

		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
