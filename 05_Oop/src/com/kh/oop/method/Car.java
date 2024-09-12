package com.kh.oop.method;
	// 단축키 tip : ctrl 누른 상태로 파란색 변수명에 마우스를 대면, 
	// 맨 처음 만들어진 변수명의 위치로 갈 수 있다.

public class Car {
	
	// 필드
	public String brand;
	public String model;
	public 	  int year;
	
	// 기본 생성자
	public Car() {
		
	} 
	
	// 필수 생성자
	public Car(String brand1, String model1, int year1) {
		this.brand = brand1;
		this.model = model1;
		this.year = year1;
	}
	
	// return method
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}

	public static void main(String[] args) {
		
		// 자동차 car1 출력
		Car car1 = new Car("도요타", "캠리", 2020);
		
		// 값을 출력
		System.out.println(car1.getBrand() + "   " + car1.getModel() + "   " + car1.getYear());

	}

}
