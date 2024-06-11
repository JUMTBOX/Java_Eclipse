package com.in28minutes.refType;

public class StringRunner {

	public static void main(String[] args) {
		System.out.println("스트링 래퍼 객체 " + "TEST".length());
		String bigStr = "this is a lot of text again";
		String[] strArr = bigStr.split(" ");

		System.out.println("포함하는가?" + bigStr.contains("a")); // === (js) String.prototype.includes

		for (String el : strArr) {
			System.out.println(el);
		}

		StringBuffer sb = new StringBuffer("test");
		// 결합
		sb.append("123");
		// 교체
		sb.setCharAt(1, 'a');

		StringBuilder sb2 = new StringBuilder("test2");
		// 결합
		sb2.append("123");
		// 교체
		sb2.setCharAt(1, 'a');
	}

}
