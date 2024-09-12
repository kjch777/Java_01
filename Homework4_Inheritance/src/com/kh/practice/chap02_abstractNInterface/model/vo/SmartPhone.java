package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone {
// class 에 abstract 를 붙이려면 class 앞에 작성한다.

// 필드
	private String maker; // 제조사 정보
	
// 메서드
	// Getter
	public String getMaker() {
		return maker;
	}
	
	// Setter
	public void setMaker(String maker) {
		this.maker = maker;
	}

	// 기본 생성자
	public SmartPhone() {
		// Ctrl + Space
	}
	
	// 스마트폰의 제원 정보를 출력하기 위한 추상 메서드
	// 메서드명에 print 가 있으니까 출력 void
	public abstract String void printInformation() {
		
	}
	
}
