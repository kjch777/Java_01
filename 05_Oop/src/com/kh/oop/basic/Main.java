package com.kh.oop.basic;
// 저장 : Ctrl + s
public class Main {
	
	// 생성자 (필수로 값을 넣어야 하거나, 초기에 담을 공간을 생성하는 메서드)
	public Main() {
		
	}
	// 내가 만든 파일 중에서 최종적으로 출력할 파일만 실행
	public static void main(String[] args) {
		// public static void practice2(){} 이었으면 문제가 없었다.
		// 무조건 메모리 공간에 고정되어 있어야 하지만, 현재 static 이 아니라 담을 공간
		Main main = new Main();
		main.practice2();
		
	}
	
	public void practice1() {
	  
		// 쿠키 클래스의 객체 생성
		쿠키 myCookie = new 쿠키();
		
		// 객체의 속성 설정
		// 쿠키의 크기와 모양을 설정
		myCookie.size = "라지";
		myCookie.shape = "동그라미";
		
		// 쿠키에 대한 정보 출력
		System.out.println("쿠키의 크기 : " + myCookie.size);
		System.out.println("쿠키의 모양 : " + myCookie.shape);
		
		쿠키 카페판매용쿠키 = new 쿠키();
		카페판매용쿠키.size = "아담함";
		카페판매용쿠키.shape = "별모양";
		
		System.out.println("쿠키의 크기 : " + 카페판매용쿠키.size);
		System.out.println("쿠키의 모양 : " + 카페판매용쿠키.shape);
		
	}
	
	public void practice2() {
	  
		Nation 국민 = new Nation(); // Nation 객체 생성
		
		국민.name = "홍길동";
		국민.age = 55;
		국민.gender = 'M';
		국민.jumin = "550101-1234567";
		
		System.out.println("이름 : " + 국민.name);
		System.out.println("나이 : " + 국민.age);
		System.out.println("성별 : " + 국민.gender);
		System.out.println("주민번호 : " + 국민.jumin);
		
		국민.speakKorean();
		국민.welfare();
		
		System.out.println("==========");
		
		Nation 국민2 = new Nation();
		국민2.name = "신짱구";
		국민2.age = 5;
		국민2.gender = '남';
		System.out.println("이름 : " + 국민2.name);
		System.out.println("나이 : " + 국민2.age);
		System.out.println("성별 : " + 국민2.gender);
		
		System.out.println("==========");
		
		국민.납세의의무();
		국민2.납세의의무();
		
	}

}
