package com.kh.practice.charCheck.exception;
//                              Exception 을 상속받아, 개발자가 원하는 예외 상황을 만들 수 있다.
public class CharCheckException extends Exception {
	
// 메서드
	// 기본 생성자
	public CharCheckException() {
		// super();
	}
	
	// 필수 생성자
	public CharCheckException(String msg) { // 어떤 문자가 들어오면, Exception 을 참조해서 처리하겠다는 코드이다.
		super(msg);
	}
	
}
