package com.kh.practice.numRange.exception;

public class NumRangeException extends Exception {
	//                         extends Exception 
	//                                 Exception 을 상속받아, 개발자가 원하는 예외 상황 대처 코드를 만들 수 있다.

// 메서드
	// 기본 생성자
	public NumRangeException() {
		// Ctrl + Space
	}
	
	// 필수 생성자
	public NumRangeException(String msg) { // msg : 메세지 == 어떤 문자
// 어떤 문자가 들어오면, Exception 을 참조해서 처리하겠다는 코드이다.
		super(msg);
	//  super(msg);
	}
}
