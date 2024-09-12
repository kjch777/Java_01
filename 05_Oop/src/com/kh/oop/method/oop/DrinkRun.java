package com.kh.oop.method.oop;

public class DrinkRun {

	// 메서드 - main - 최종 출력 및 실행할 코드를 작성하는 공간
	public static void main(String[] args) {
		
		// 객체 공간 생성
		DrinkMaker dm1 = new DrinkMaker("허브티", 100, 5);
		dm1.makeDrink();
		
		DrinkStore ds1 = new DrinkStore(dm1, "메가커피", "경기도 수원시", false);
		ds1.orderDrink();
		
		DrinkMaker dm2 = new DrinkMaker("아메리카노", 300, 1);
		dm2.makeDrink();
		
		DrinkStore ds2 = new DrinkStore(dm2, "스타벅스", "서울시 서초구", true);
		ds2.orderDrink();

	}

}
