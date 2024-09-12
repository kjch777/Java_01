package com.kh.variable.pre;

public class EnumPre {

// 필드
	enum 무지개 { 빨강색, 주황색, 노랑색, 초록색, 파랑색, 남색, 보라색 };
	enum 소비자 { 학생, 직장인, 연장자 } // ; 없어도 되기는 하는 것 같다.
	enum 판매자 { 소매업, 도매업, 중매업 }; // 하지만 써줘야 하는 것 같다.
	
// 메서드
	// 기본 생성자
		public EnumPre() {
			
		}
		
	// 출력 void
	public void method1() {
		// 배열에 담기
		무지개[] 배열 = 무지개.values(); // .values(); 는 enum 으로 작성한 값을 가지고 올 때 사용한다.
		
		// for - each 문으로 출력하기
		for(무지개 무 : 배열) {
			System.out.println(무);
		}
	}
	
	public void method2() {
		// 배열에 담기
		소비자[] 배열1 = 소비자.values();
		판매자[] 배열2 = 판매자.values();
		
		System.out.println("=== 소비자 ===");
		
		// for - each 문을 사용하여 소비자, 판매자를 각각 출력하기
		for(소비자 c : 배열1) {
			System.out.println(c);
		}
		
		System.out.println("=== 판매자 ===");
		
		for(판매자 s : 배열2) {
			System.out.println(s);
		}
		
		// 소비자{학생} , 판매자{소매업} 
		소비자 c = 소비자.학생;
		System.out.println("학생의 등급 : " + c.ordinal());
		
		판매자 s = 판매자.소매업;
		System.out.println("소매업의 등급 : " + s.ordinal());
		
		System.out.println("=== 등급 비교 결과 ===");
		
		// .ordianl(); , if 문 사용하여 비교하기
		if(c.ordinal() > s.ordinal()) {
			System.out.println("소비자의 등급이 더 높습니다.");
		} else if(c.ordinal() == s.ordinal()) {
			System.out.println("소비자와 판매자의 등급이 같습니다.");
		} else {
			System.out.println("판매자의 등급이 더 높습니다.");
		}
	}
	
	// 최종 출력 및 실행
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		ep.method2();
	}
	
}
