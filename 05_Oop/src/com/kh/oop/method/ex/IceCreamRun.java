package com.kh.oop.method.ex;

public class IceCreamRun {

	// 메서드 - main - 최종 출력 및 실행할 코드 작성
	public static void main(String[] args) {
		
	// 객체 공간 생성
		// 기본 생성자 사용
		IceCream ic1 = new IceCream(); // 공간이니까 ();
		
		ic1.setName("더위사냥");
		ic1.setSugar(4);
		ic1.setMilk(false);
		
		// 기본 생성자 출력
		ic1.makeIceCream();
		
		// 필수 생성자 사용
		IceCream ic2 = new IceCream("탱크보이", 10, true);
		
		// 필수 생성자 출력
		ic2.makeIceCream();
	}

}
