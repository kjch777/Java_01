package com.kh.Inheritance.OverrideEX;

public class 고양이 extends 동물 {
	
// 필드
	// 필수 생성자
	public 고양이(String 이름) {
		super(이름);
	}
	
	// 동물의 소리를 가지고 와서, 고양이 소리로 변경해보자
	@Override
	public void 소리() {
		System.out.println(이름 + "이(가) 고영 하고 웁니다.");
	}

}
