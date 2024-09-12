package com.kh.Inheritance.OverrideEX;

public class 토끼 extends 동물 {

// 필드
	// 필수 생성자
	public 토끼(String 이름) {
		super(이름);
	}
	
	// 동물의 소리를 가지고 와서, 토끼 울음소리로 변경해보자
	@Override
	public void 소리() {
		System.out.println(이름 + "이(가) 삑삑 하고 웁니다.");
	}
	
}
