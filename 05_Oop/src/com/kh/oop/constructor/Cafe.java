package com.kh.oop.constructor;

public class Cafe { // class 에는 소괄호 ( ) 가 들어가지 않는다.
	
	// 필드 선언
	public String name;
	public String location; // 필드에서는 자료형 변수명 을 작성하고
	public    int tableNum; // 값은 지정하지 않는다.

	// 기본 생성자
	// 생성자 명은 반드시 class 명과 같아야 한다.
	public Cafe() {
		// 기본 생성자에는 값을 아무것도 넣어주지 않는다.
	}
	
	// 필수 생성자
	// 생성자 명은 반드시 class 명과 같아야 한다.
	public Cafe(String name1, String location1, int tN) {
		this.name = name1;
		this.location = location1; // this 를 사용하여 필드에서 변수명을 불러오고,
		this.tableNum = tN; // 필수 생성자 내부의 매개변수를 값으로 지정한다.
	}
	
	// void 메서드 : 출력문 작성에 사용
	// 메서드 명은 class 명과 달라도 상관 없다.
	public void cafeInfo() {
		System.out.println("===== 카페 맛집을 찾았습니다! =====");
		System.out.println("카페 이름 : " + name); // 필드에서 변수명을 불러온다.
		System.out.println("카페 장소 : " + location);
		System.out.println("탁상 갯수 : " + tableNum + "\n\n");
		// 출력문에서는 + 를 사용하여 연결한다.
	}
	
	public static void main(String[] args) {
		System.out.println("안녕하세요? 카페 탐색기 입니다.");
		System.out.println("===== 카페 탐색하기 =====\n\n");
		
		// Cafe 객체 사용
		Cafe cafe1 = new Cafe(); // 새로운 공간 생성
		cafe1.name = "스타벅스";
		cafe1.tableNum = 100;
		cafe1.cafeInfo();
		
		Cafe cafe2 = new Cafe();
		cafe2.location = "광교 호수공원";
		cafe2.tableNum = 50;
		cafe2.cafeInfo();
		
		Cafe cafe3 = new Cafe("커피빈", "역삼역 3번 출구", 35);
		cafe3.cafeInfo();

	}

}
