package com.in28minutes.primitive.datatypes.charType;

import java.util.Arrays;

public class MyChar {
	private char ch;

	MyChar(char ch) {
		this.ch = ch;
	}

	/** 모음인가 ? */
	public boolean isVowel() {
		char[] arr = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		if (Arrays.asList(arr).contains(ch)) {
			return true;
		}
		return false;
	}

	/** 숫자인가? */
	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) {
			return true;
		}
		return false;
	}

	/** 알파벳인가? */
	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 90) {
			return true;
		}
		if (ch >= 97 && ch <= 122) {
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		if (!this.isVowel() && this.isAlphabet()) {
			return true;
		}
		return false;
	}

	static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(" " + ch);
		}
	}

	static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(" " + ch);
		}
	}
}
