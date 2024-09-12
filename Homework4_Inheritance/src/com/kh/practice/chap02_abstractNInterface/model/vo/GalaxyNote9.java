package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone {
	
// 필드
	// 부모에게 상속받은 maker 필드를 "삼성" 으로 초기화
	String maker = "삼성";	
	
// 메서드
	// 기본 생성자
	public GalaxyNote9(String maker) { // (부모 클래스 필드에 있는 자료형과 변수명)
	
		super(maker); // 소괄호 ( ) 안에 변수명만 넣어준다.
		
		// this.
		this.maker = maker;
		
	}
	
	// 실행 화면을 참조하여 오버라이딩
	// 메서드 명에 print 가 있으니까 출력 void
	@Override
	public String void printInformation() {
		
	}

}
