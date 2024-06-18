package com.in28minutes.primitive.datatypes.charType;

public class StringMagic {

	public static int countUppercaseLetters(String str) {
		if (str.isEmpty()) {
			return 0;
		}

		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			char spell = str.charAt(i);
			if (Character.isUpperCase(spell)) {
				result += 1;
			}
		}
		return result;
	}

	public static boolean hasConsecutiveDuplicates(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			char bef = str.charAt(i);

			for (int j = i + 1; j < str.length(); j++) {
				char cur = str.charAt(j);
				if (bef == cur) {
					return true;
				}
			}
		}

		return false;
	}

	public static int getRightmostDigit(String str) {
		int result = -1;

		for (int i = 0; i < str.length(); i++) {
			char spell = str.charAt(i);
			if (Character.isDigit(spell)) {
				result = Character.getNumericValue(spell);
			}
		}
		return result;
	}

	public static String findLongestWord(String sentence) {
		String result = "";
		String cur = "";

		if (sentence.isEmpty()) {
			return result;
		}

		for (int i = 0; i < sentence.length(); i++) {
			char spell = sentence.charAt(i);

			if (!Character.isWhitespace(spell)) {
				cur = cur + spell;
				if (i == sentence.length() - 1 && cur.length() > result.length()) {
					result = cur;
				}
			} else {
				if (cur.length() > result.length()) {
					result = cur;
				}
				cur = "";
			}

		}

		return result;
	}
}
