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
	}

}
