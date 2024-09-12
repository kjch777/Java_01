package com.kh.oop.method.ex;

public class HamburgerStore {
	
	// 필드
	private String name;
	private int price;
	
	// setter - 나중에 값을 넣을 때 사용한다.
	public void setName(String name) {
		this.name = name; // 그래서 내부에 this
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// getter - 나중에 값을 출력할 때 사용된다.
	public String getName() {
		return name; // 그래서 내부에 return
	}
	public int getPrice() {
		return price;
	}
	
	// 메서드 - 생성자 - 기본
	public HamburgerStore() {
		
	}
	
	// 메서드 - 생성자 - 필수
	//			  새로 지정 - 자료형 변수명
	public HamburgerStore(String name1, int price1) {
		this.name = name1;
		this.price = price1; // this. 필드 변수명 = 필수 생성자 내부 변수명;
	}
	
	// 메서드 - void - 출력
	public void info() {
		System.out.println("버거 이름 : " + name);
		System.out.println("버거 가격 : " + price);
	}
	
	// 메서드 - main - 최종 출력 및 실행
	public static void main(String[] args) {
		
		// 객체 HamburgerStore 의 새 공간 hs1 생성
		HamburgerStore hs1 = new HamburgerStore();
		
		// 기본 생성자로 출력
		hs1.setName("데리 버거"); // main 메서드 안에서 생성한 객체를 불러와서
		hs1.setPrice(3_500);   // set 으로 출력할 값을 지정한다.
		hs1.info();
		
		System.out.println("\n===== 햄버거 파티 =====\n");
		
		// 필수 생성자로 출력
		// 객체 HamburgerStore 의 새 공간 hs2 생성 후, 
		// HamburgerStore 의 소괄호 ( ) 안에 출력하고 싶은 값을 지정한다.
		HamburgerStore hs2 = new HamburgerStore("불고기 버거", 5_000);
		hs2.info();
		
	}
}
