package com.in28minutes.typeOfloops;

public class LcmAndGcdRunner {

	public static void main(String[] args) {
		LcmExtractor extractor = new LcmExtractor(9, 6);
		GcdExtractor extractor2 = new GcdExtractor(48, 60);
		int result = extractor.calculateLCM();
		System.out.println("결과는?  " + result);

	}

}

