package com.kh.oop.basic;

public class Bank { // class 명이 영어라면, 반드시 대문자로 시작해야 한다.
	// 이름	계좌번호	잔액	비밀번호	마케팅수신동의
	// 필드
	public String name;
	public String accountNumber; // 필드에는 참조형과 변수명만 지정해주면 된다.
	public 	  int balance;		 // 값은 지정해주면 안 된다.
	public String password;
	public boolean agree; 
	
	
	// 생성자 메서드
	// 초기 공간 생성자 : 이름이 클래스 이름과 반드시 같아야 한다. 이 때, 대/소문자도 반드시 같아야 한다.
	public Bank() {
		
	}
	
	
	// 필수 생성자
	public Bank(String name, String mA, int mB, String mP, boolean agree) {
		// 필수 생성자 소괄호 ( ) 안의 필수 조건은 , 로 구분하여 작성한다.
		// 필수 생성자 소괄호 ( ) 안의 필수 조건은 자료형과 변수명만 작성한다.
		this.name = name;
		this.accountNumber = mA; // 필수 생성자 중괄호 { } 안 작성법 
		this.balance = mB;		 // this.필드 변수명 = 필수 생성자 소괄호 ( ) 안의
		this.password = mP;		 // 				   새로운 변수명
		this.agree = agree;
	}
	
	
	// 출력 메서드
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("잔액 : " + balance);
		System.out.println("비밀번호 : " + password);
		System.out.println("마케팅수신동의 : " + agree);
	}
	
	
	// 최종 메인 출력 메서드
	public static void main(String[] args) {
		Bank customer1 = new Bank();
		customer1.name = "Joe";
		customer1.accountNumber = "111-2222-33333";
		customer1.balance = 1_234;
		customer1.password = "0A1b";
		customer1.agree = true; // boolean true 의 경우
		
		customer1.info();
		
		System.out.println("==========");
		
		Bank customer2 = new Bank();
		customer2.name = "Dan";
		customer2.accountNumber = "000-1111-22222";
		customer2.balance = 1_234_567;
		customer2.password = "9Q8w";
		// boolean 의 기본값은 false 이다.
		// 아예 작성을 하지 않으면 자동으로 false 라고 출력된다.
		
		customer2.info();
		
		System.out.println("==========");
		
		Bank customer3 = new Bank("Mike", "012-3456-78910", 12_345, "5Q5p", true);
	// 클래스명 새로운 변수명 = new 클래스명
		// String 값은 큰 따옴표 " " 안에, int 와 boolean 값은 따옴표 없이 그냥 작성한다.
		// 값과 값 사이에는 , 를 사용해서 구분한다.
		customer3.info();
	// 새로운 변수명.출력 생성자명();
	}
}
