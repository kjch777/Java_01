package com.kh.oop.method.oop;

public class CoffeeRun {
	
	// 메서드 - main - 최종 출력 및 실행할 코드를 작성하는 공간
	public static void main(String[] args) {
		
		// 커피 만들기
		CoffeeMaker cm = new CoffeeMaker("아메리카노", 1, false);
		
		// 커피 가게 정보
		CoffeeStore cs = new CoffeeStore(cm, "스타 벅스", "서울시 강남구");
		
		// 주문 및 제조
		cs.orderCoffee();
	}

}
