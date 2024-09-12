package com.kh.oop.constructor;

public class Join {
	
	// 필드
	public int memberNo;
	public String nickName;
	public String memberName;
	public String phoneNumber;
	
	// 기본 생성자
	public Join() {
		// 모든 괄호 안에 아무것도 작성하지 않는다.
	}
	
	// 필수 생성자
	public Join(int memberNo, String nN, String memberName, String pN) {
	// 이것은 필드에 있는.필드 변수명에 = 내부 변수명을 값으로 넣겠다.	
		this.memberNo = memberNo; // this. 필드 변수명 = 필수 생성자 내부 변수명
		this.nickName = nN;  // 변수명은 서로 같아도 아무런 상관이 없다.
		this.memberName = memberName;
		this.phoneNumber = pN;
		
	}
	
	// 메서드 : 클래스 안에 존재하며, 특정 기능을 할 수 있도록 묶어 놓은 코드 모음
	// void 메서드 : 결과를 전달하지 않는 메서드
	public void memberInfo() {
		System.out.println("회원 번호 : " + memberNo); // 필드에 있는 변수명
		System.out.println("회원 I D : " + nickName);
		System.out.println("회원 이름 : " + memberName);
		System.out.println("전화 번호 : " + phoneNumber);
	}

	// 최종으로 실행해주는 메인 메서드
	public static void main(String[] args) {
		System.out.println("===== 1st =====");
		
		// 회원 1에 대한 정보 확인
		// Join 객체 생성
		Join member1 = new Join();
		
		// 필수로 작성할게 없었을때
		member1.nickName = "용용선생";
		member1.memberName = "김이박";
		member1.phoneNumber = "010-1234-5678";
		member1.memberInfo();
		
		System.out.println("===== 2nd =====");
		
		Join member2 = new Join();
		member2.memberNo = 1;
		member2.nickName = "hongKong";
		member2.memberName = "호랑";
		member2.phoneNumber = "010-7777-8888";
		member2.memberInfo();
		
		System.out.println("===== 3rd =====");
		
		// 필수 작성 조건이 생겼을때
		Join member3 = new Join(2, "용기사", "호호", "010-5555-8888");
		member3.memberInfo();
		
		System.out.println("===== 4th =====");
		
		Join member4 = new Join();
		member4.memberNo = 3;
		member4.nickName = "saintJ";
		member4.memberName = "성이름";
		member4.phoneNumber = "010-7899-5465";
		member4.memberInfo();
		
		System.out.println("===== 5th =====");
		
		Join member5 = new Join(4, "superMan", "존 시나", "010-1938-1932");
		member5.memberInfo();
	}

}
