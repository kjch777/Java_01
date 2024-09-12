package com.kh.oop.method.ex;
// 같은 package(폴더) 안에서 class 만 따로 쓸 경우,
// import 를 하지 않아도 문제 없이 실행 된다.

public class CoffeeRun {
	
	public static void main(String[] args) {
		
		// CoffeeMaker 객체 생성 - 기본 생성자 이용
		CoffeeMaker cM1 = new CoffeeMaker();
		cM1.setCoffeType("아메리카노");
		cM1.setSugar(1);
		cM1.setMilk(false); 
		// boolean 값 true false 는 int 처럼 문장부호 없이 그냥 쓰면 된다.
		
		// 출력
		cM1.makeCoffee();
		
		// 필수 생성자 이용
		CoffeeMaker cM2 = new CoffeeMaker("카페라떼", 5, true);
		cM2.makeCoffee();
		
	}

}
