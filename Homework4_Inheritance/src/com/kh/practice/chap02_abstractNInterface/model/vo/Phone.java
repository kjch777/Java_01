package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	
// 필드
	public char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};

// 메서드
	// 추상 메서드
	public abstract String makeCall() {
	// abstract (추상) 를 메서드에 붙이려면 접근제어자 바로 뒤에 작성한다.
		
	}
	
	// 추상 메서드
	public abstract String takeCall() {
		
	}
	
}
