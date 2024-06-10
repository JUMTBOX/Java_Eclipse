package com.in28minutes.typeOfloops;

public class EnumRunner {

	public static void main(String[] args) {
		String enumStr1 = IgoEnumA.IGO_ENUM_A.getCode();
		System.out.println("ENUM 1번: " + enumStr1);

		String enumStr2 = IgoEnumA.IGO_ENUM_SIGGIYA.getCode();
		System.out.println("ENUM 2번: " + enumStr2);
	}

}
