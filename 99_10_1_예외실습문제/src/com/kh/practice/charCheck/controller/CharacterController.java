package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

// 메서드
	// 기본 생성자
	public CharacterController() {
		
	}
	
// 출력 void 
	// 문자열이 비어있을 때, 예외 상황 발생 시에 출력할 문구 만들기
	public int countAlpha(String s) throws CharCheckException {
		if(s == null || s.isEmpty()) {
			throw new CharCheckException("입력된 문자열이 비어있습니다.");
		}
		if(s.contains(" ")) {
			throw new CharCheckException("문자열에 공백이 포함되어 있습니다.");
		}
		// match : 있는지 확인
		if(s.matches(".*[0-9_].*")) {
			throw new CharCheckException("문자열에 숫자나 특수기호가 포함되어 있습니다.");
		}
		// 알파벳이 들어오면, 알파벳이 무엇인지 확인하는 코드
		int count = 0; // int 이므로, return 값으로 숫자를 넣어준다.
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//        소문자 a ~ z               대문자 A ~ Z
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				count++;
			}
		}
		return count;
	}
}
