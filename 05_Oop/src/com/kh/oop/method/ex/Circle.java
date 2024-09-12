package com.kh.oop.method.ex;

public class Circle {
	
	// 필드
	private double PI = 3.14;
	private int radius = 1;
	
	
	// Getter Setter 는 필드에 작성하는 중...
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	
	public void setPI(double pI) {
		PI = pI;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 기본 생성자
	public Circle() {
		
	}
	
	// 메서드
	public void incrementRadius() { // increment 증가		radius 반지름
		// 반지름 1씩 증가
		radius++;
	}
	
	public void getAreaOfCicle() { // area 넓이
		// 실수가 나오기 때문에 double
		double area = PI * radius * radius;
		System.out.println("원의 넓이 : " + area);
	}
	
	public void getSizeOfCircle() { // size 둘레
		// 실수가 나오기 때문에 double
		double size = 2 * PI * radius;
		System.out.println("원의 둘레 : " + size);
	}
	
	public static void main(String[] args) {
		// 원 이라는 객체 생성
		Circle 원 = new Circle();
		
		// 반지름이 1씩 증가하기 전, 원의 둘레와 넓이 출력하기
		System.out.println("===== 원의 초기 둘레와 넓이 =====");
		원.getSizeOfCircle();
		원.getAreaOfCicle();
		
		원.incrementRadius(); // 반지름 1씩 증가
		// 반지름이 1씩 증가한 후, 원의 둘레와 넓이 출력하기
		System.out.println("반지름 1 증가 후, 원의 둘레와 넓이");
		원.getSizeOfCircle();
		원.getAreaOfCicle();
	}
	
}
