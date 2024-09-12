package com.kh.practice.set.model.vo;

public class Lottery {
	
// 필드
	private String name;
	private String phone;
	
// 메서드
	// 기본 생성자
	public Lottery() {
		// Ctrl + Space
	}
	
	// 필수 생성자 (즉, 매개변수 생성자)
	public Lottery(String name, String phone) { // Alt + Shift + S ▶ O
		// super(); 부모 class 의 매개변수 생성자 내부에는 super(); 가 필요 없다.
		this.name = name;
		this.phone = phone;
	}
	
	// Setter // Alt + Shift + S
	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Getter // Alt + Shift + S
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
	// @Override toString
	// 오버라이드는 return "출력하고 싶은 문구 : " + 출력하고 싶은 값;
	// 오버라이드는 부모 class 에서도 존재 가능하다.
	@Override
	public String toString() {
		return "이름 : " + name + " , 전화 번호 : " + phone;
	}

}
