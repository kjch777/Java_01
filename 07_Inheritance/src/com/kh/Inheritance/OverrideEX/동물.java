package com.kh.Inheritance.OverrideEX;

public class 동물 {
	
	// 필드
	String 이름; // Alt + Shift + S 로 Getter Setter 작성

// method
	// Getter
	public String get이름() {
		return 이름;
	}

	// Setter
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	
	// 기본 생성자
	public 동물() {
		
	}
	
	// 필수 생성자
	public 동물(String 이름) {
		this.이름 = 이름;
	}
	
	// 출력 void : 반환하는 값 없이 출력만 진행
	public void 소리() {
		System.out.println("동물이 소리를 냅니다.");
	}

}
