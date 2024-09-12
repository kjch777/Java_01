package com.kh.Inheritance.OverLoadingEX;

public class Run {
	
	// main method : main method 는 오버로딩, 오버라이딩 하지 않는게 규칙이다.
	public static void main(String[] args) {
		
		Person 사람1 = new Person();
		사람1.setName("홍길동");
		
		Person 사람2 = new Person("장희빈");
		
		Person 사람3 = new Person("신짱구", 5);
		
		사람1.displayInfo();
		사람2.displayInfo();
		사람3.displayInfo();
		
	}

}
