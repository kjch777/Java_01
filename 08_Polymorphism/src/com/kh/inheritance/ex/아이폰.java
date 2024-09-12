package com.kh.inheritance.ex;

// 자식 class
public class 아이폰 extends 스마트폰 {
	
// 필드
	private int IOS;
	
// 메서드
	// Setter
	public void setIOS(int iOS) {
		IOS = iOS;
	}

	// Getter : Alt + Shift + S
	public int getIOS() {
		return IOS;
	}
	
	// 기본 생성자
	public 아이폰() {
		// Ctrl + Space + Enter
	}
	
	// 필수 생성자
	public 아이폰(String 화면, String 통신사, String 성능, int iOS) {
		// Alt + Shift + S ▶ O : 전체 생성
		super(화면, 통신사, 성능);
		this.IOS = iOS;
	}
	
	// toString
	public String toString() {
		return "아이폰 버전 : " + IOS + " / " + super.toString();
	}

}
