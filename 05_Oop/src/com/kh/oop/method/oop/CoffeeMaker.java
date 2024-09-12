package com.kh.oop.method.oop;

public class CoffeeMaker {
	
	// 필드
	private String coffeeType; // 커피 종류
	private int sugar; // 설탕 양
	private boolean milk; // 우유 유무
	
	
	// setter
	public void setCoffeType(String coffeType) {
		this.coffeeType = coffeType;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public void setMilk(boolean milk) { // set 은 똑같이 set 으로 나온다 ㅡㅡ
		this.milk = milk;
	}
	
	// getter
	public String getCoffeType() {
		return coffeeType;
	}

	public int getSugar() {
		return sugar;
	}

	public boolean isMilk() { // boolean 은 get 이 아니라 is 로 나온다.
		return milk;
	}

	
	// 메서드 - 생성자 - 기본
	public CoffeeMaker () {
		
	}
	
	// 메서드 - 생성자 - 필수
	public CoffeeMaker(String cT, int sG, boolean mK) {
		this.coffeeType = cT;
		this.sugar = sG;
		this.milk = mK;
	}
	
	// 메서드 - void - 출력
	public void makeCoffee() {
		
		System.out.println("\n===== 커피 만들기 ! =====\n");
		System.out.println("어떤 커피를 만들까요? : " + coffeeType + "를 만들자!");
		System.out.println("설탕은 얼마나 넣을까요? : " + sugar + "g");
		
		// 만약 우유를 넣겠다면
		if(milk) {
			System.out.println("우유 넣자!");
		} else {
			System.out.println("우유 빼자!");
		}
		System.out.println("커피 완성~!");
	}
	
	/*
	// main - 최종 출력 및 실행할 코드 작성
	public static void main(String[] args) {
		
		// 기본 생성자로 객체 생성
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeType("아메리카노");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		
		// 기본 생성자로 출력
		coffee1.makeCoffee();
		
		System.out.println("\n===== 한잔 더! =====\n");
		
		// 필수 생성자로 객체 생성
		CoffeeMaker coffee2 = new CoffeeMaker("카페라떼", 5, true);
		
		// 필수 생성자로 출력
		coffee2.makeCoffee();
	}
	*/
	
}
