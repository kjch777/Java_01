package com.kh.example.practice1.model.vo;

public class Member {
	// 필드
	public String memberId;
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	
	// 기본 생성자 메서드
	public Member() {
		
	}
	
	
	// 출력 메서드 : void 가 적혀 있으면 출력 메서드 이다.
	public void changeName(String name) {
		this.memberName = name;
		System.out.println("변경된 이름 : " + name);
	}
	public void printName() {
		System.out.println("이름 : " + memberName);
	}
		// 마무리로 항상 저장 Ctrl + s
	
	
	// public void changeName(String name) {
		 // this.memberName = name;
	// }

	//값을 받아서 전달하는 메서드
	// public String changeEmail(String 수정된이메일) {
			// this.email = 수정된이메일;
		// return email;
	// }
}
