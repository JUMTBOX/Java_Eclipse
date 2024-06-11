package com.in28minutes.refType;

public class WrapperClassRunner {

	public static void main(String[] args) {
		// 방법1
		Integer six = Integer.valueOf(6);
		// 방법2 -> auto boxing
		// Integer.valueOf(7)을 자동적으로 실행해준다.
		Integer seven = 7;

		// 래퍼객체의 인스턴스를 만들때는 new키워드가 아닌 각 래퍼객체의 정적 메서드 valueOf를 활용한다.
	}

}
