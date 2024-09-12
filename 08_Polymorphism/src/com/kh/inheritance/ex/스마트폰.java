package com.kh.inheritance.ex;

// 부모 class
public class 스마트폰 {

// 필드	
	private String 화면;
	private String 통신사;
	private String 성능;

// 메서드
	// Setter
	public void set화면(String 화면) {
		this.화면 = 화면;
	}

	public void set통신사(String 통신사) {
		this.통신사 = 통신사;
	}

	public void set성능(String 성능) {
		this.성능 = 성능;
	}

	// Getter
	public String get화면() {
		return 화면;
	}

	public String get통신사() {
		return 통신사;
	}

	public String get성능() {
		return 성능;
	}

	// 기본 생성자
	public 스마트폰() {
		// Ctrl + Space + Enter
	}

	// 필수 생성자
	public 스마트폰(String 화면, String 통신사, String 성능) { // Alt + Shift + S ▶ O : 전체 생성
		super();
		this.화면 = 화면;
		this.통신사 = 통신사;
		this.성능 = 성능;
	}
	
	// 출력 void 또는 반환 return
	
	// toString 은 String 밑에 만들어진 method
	@Override
	public String toString() {
		return "스마트폰 [화면 = " + 화면 + " , 통신사 = " + 통신사 + " , 성능 = " + 성능 + "]";
	}

}
