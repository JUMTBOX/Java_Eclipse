package com.in28minutes.typeOfloops;

public enum IgoEnumA {
	IGO_ENUM_A("아이고 이넘아")
	,IGO_ENUM_SIGGIYA("아이고 이눔 시끼야");

	private String code;

	IgoEnumA(String text) {
		this.code = text;
	}

	public String getCode() {
		return code;
	}
}
