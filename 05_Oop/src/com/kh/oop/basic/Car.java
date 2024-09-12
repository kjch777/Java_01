package com.kh.oop.basic;

public class Car {
	// 필드
	public String color; // 차의 색상
	public int speed; // 차의 속도
	public String door; // 문의 갯수
	public String window; // 창문의 갯수
	public String sunRoof; // 썬루프 유무
	public String insurance; // 보험
	
	
	// 생성자 = 메서드를 담거나 초기화를 위한 것
	public Car() {
		
	}
	// 생성자 = 필수 옵션
	// 생성자는 class 이름과 똑같아야 한다.
	// 생성자 이름 == class 이름 == 파일명
 // public Car(글자로 받을 차 색상, 글자로 받을 차 속도) {
	public Car(String inputColor, int inputSpeed) {
		this.color = inputColor;
		this.speed = inputSpeed;
	}
	
	
	//메서드
	public void displayInfo() {
		System.out.println("  차의 제원");
		System.out.println("색상 : " + color);
		System.out.println("속도 : " + speed);
	}
	
	
	// 메인 메서드
	public static void main(String[] args) {
		// Car 가 있을 공간을 마련하기
		Car myCar = new Car();
		myCar.color = "빨강색";
		System.out.println("내 차의 색상 : " + myCar.color);
		
		
		// 공장에서 차를 만들어야 하고, 색상과 속도는 이미 지정이 된 상황
		// 색상과 속도는 기업에서 원하는 제원으로 차를 출고
		Car orderCar = new Car("black", 60);
		orderCar.displayInfo();
		
		Car storeCar = new Car("white", 100);
		storeCar.displayInfo();
	}

}
